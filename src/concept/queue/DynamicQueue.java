package concept.queue;

import java.lang.reflect.Array;

public class DynamicQueue<T> extends CircularQueue<T>{

    Class<T> c; //declaration of a variable c of type Class<T>, where T is a generic type parameter

    //constructors
    public DynamicQueue(Class<T> c) {
        super(c);
        this.c = c;
    }

    public DynamicQueue(Class<T> c, int size) {
        super(c, size);
        System.out.println("Initial capacity of Queue: "+ queue.length);
        this.c = c;
    }

    //method for inserting an element in the queue
    @Override //annotation used to correctly overrides the parent class method
    public void enQueue(T data) {
        if (isFull()) {
            expand();
        }
        super.enQueue(data);
    }

    @SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generic
    //provides dynamic array feature to the stack (in terms of expanding)
    private void expand() {
        T [] updatedQueue = (T[]) Array.newInstance(c, queue.length*2);
        for (int i=0; i< queue.length; i++) {
            updatedQueue[i] = queue[(front+i)% queue.length];
        }
        front = 0;
        rear = queue.length;

        queue = updatedQueue;
    }

    //method for deleting an element from the queue
    @Override //annotation used to correctly overrides the parent class method
    public T deQueue() {
        T data = super.deQueue();
        if (size<=queue.length/4 && queue.length>1) {
            shrink();
        }
        return data;

    }

    @SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generic
    //provides dynamic array feature to the stack (in terms of shrinking)
    private void shrink() {
        T [] updatedQueue = (T[]) Array.newInstance(c, queue.length/2);
        for (int i=0; i<size; i++) {
            updatedQueue[i] = queue[(front+i)% queue.length];
        }
        front = 0;
        rear = size-1;

        queue = updatedQueue;
    }

    //prints the queue
    @Override //annotation used to correctly overrides the parent class method
    public void display() {
        super.display();
        System.out.println("Queue Capacity:" + queue.length);
    }
}
