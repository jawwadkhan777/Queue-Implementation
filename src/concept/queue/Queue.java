package concept.queue;

import java.lang.reflect.Array;

public class Queue<T> {
    protected T [] queue; //declare queue array
    protected static final int defaultSize = 4; //initialize the default capacity of queue array

    protected int rear, size = 0; //rear pointer for inserting the element in the queue and initially size is zero

    //constructors
    public Queue(Class<T> c) {
        this(c, defaultSize);
    }
    @SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generic
    public Queue(Class<T> c, int size) {
        this.queue = (T[]) Array.newInstance(c, size);
        if (this instanceof CircularQueue) {
            if (this instanceof DynamicQueue) {
                System.out.println("Dynamic Queue Implementation");
                System.out.println("----------------------------");
            } else {
                System.out.println("Circular Queue Implementation");
                System.out.println("-----------------------------");
            }
        } else {
            System.out.println("Custom Queue Implementation");
            System.out.println("-----------------------------");
        }
    }

    //method for inserting an element in the queue
    public void enQueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full, not inserted!");
            return;
        }
        queue[rear++] = data;
        size++;
    }

    //method for deleting an element from the queue
    @SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generic
    public T deQueue() {
        if (isEmpty()) {
            return (T) "Queue is empty, nothing dequeued!";
        }
        T data = queue[0];
        for (int i=1; i<rear; i++) {
            queue[i-1] = queue[i];
        }
        rear--;
        size--;

        return data;
    }

    //front element of the queue
    public T front() {
        return queue[0];
    }

    //checks the queue is full or not
    protected boolean isFull() {
        return size == queue.length;
    }

    //checks the queue is empty or not
    protected boolean isEmpty() {
        return size==0;
    }

    //print the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i=0; i<rear; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
