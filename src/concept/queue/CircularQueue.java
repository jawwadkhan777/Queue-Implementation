package concept.queue;

public class CircularQueue<T> extends Queue<T>{

    protected int front = 0; //front pointer for removing/deleting the element in the queue

    //constructors
    public CircularQueue(Class<T> c) {
        super(c);
    }

    public CircularQueue(Class<T> c, int size) {
        super(c, size);

    }

    //method for inserting an element in the queue
    @Override //annotation used to correctly overrides the parent class method
    public void enQueue(T data) {
        super.enQueue(data);
        rear = rear % queue.length;
    }

    //method for deleting an element from the queue
    @SuppressWarnings("unchecked") //annotation used to suppress compiler warnings about unchecked operations, commonly arising from the use of generic
    @Override //annotation used to correctly overrides the parent class method
    public T deQueue() {
        if (isEmpty()) {
            return (T) "Queue is empty, nothing dequeued!";
        }
        T data = queue[front++];
        front = front % 5;
        size--;

        return data;
    }

    //front element of the queue
    @Override //annotation used to correctly overrides the parent class method
    public T front() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }

    //prints the queue
    @Override //annotation used to correctly overrides the parent class method
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i=front; i<front+size; i++) {
            System.out.print(queue[i%queue.length]+" ");
        }
        System.out.println();
    }
}

