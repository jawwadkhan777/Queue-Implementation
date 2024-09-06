package concept.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(Integer.class);

        queue.display();
        System.out.println("------------------------------");

        queue.enQueue(7);
        queue.enQueue(3);
        queue.enQueue(1);
        queue.enQueue(15);
        queue.display();

        System.out.println("------------------------------");

        queue.enQueue(77);
        queue.display();

        System.out.println("------------------------------");

        System.out.println(queue.deQueue()+" dequeued from the queue!");
        queue.display();

        System.out.println("------------------------------");

        System.out.println("Front of the queue: " + queue.front());

        System.out.println("------------------------------");

//        Queue<Integer> circularQueue = new CircularQueue<>(Integer.class);
//
//        circularQueue.enQueue(6);
//        circularQueue.enQueue(4);
//        circularQueue.enQueue(0);
//        circularQueue.enQueue(9);
//        circularQueue.display();
//
//        System.out.println("------------------------------");
//
//        circularQueue.enQueue(77);
//        circularQueue.display();
//
//        System.out.println("------------------------------");
//
//        System.out.println(circularQueue.deQueue()+" dequeued from the queue!");
//        System.out.println(circularQueue.deQueue()+" dequeued from the queue!");
//        circularQueue.display();
//
//        System.out.println("------------------------------");
//
//        circularQueue.enQueue(77);
//        circularQueue.enQueue(100);
//        circularQueue.display();
//
//        System.out.println("------------------------------");
//
//        System.out.println("Front of the queue: " + circularQueue.front());
//
//        System.out.println("------------------------------");

//        DynamicQueue<Integer> dynamicQueue = new DynamicQueue<>(Integer.class, 2);
//
//        dynamicQueue.enQueue(65);
//        dynamicQueue.enQueue(45);
//        dynamicQueue.display();
//
//        System.out.println("------------------------------");
//
//        dynamicQueue.enQueue(25);
//        dynamicQueue.display();
//
//        System.out.println("------------------------------");
//
//        dynamicQueue.enQueue(55);
//        dynamicQueue.enQueue(75);
//        dynamicQueue.enQueue(85);
//        dynamicQueue.display();
//
//        System.out.println("------------------------------");
//
//        System.out.println(dynamicQueue.deQueue()+" dequeued from the queue!");
//        System.out.println(dynamicQueue.deQueue()+" dequeued from the queue!");
//        System.out.println(dynamicQueue.deQueue()+" dequeued from the queue!");
//        System.out.println(dynamicQueue.deQueue()+" dequeued from the queue!");
//        dynamicQueue.display();
//
//        System.out.println("------------------------------");
    }
}