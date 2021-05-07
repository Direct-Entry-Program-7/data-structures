import ds.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.empty());      // true
        queue.enqueue(10);
        System.out.println(queue.empty());      // false
        queue.enqueue(20);
        queue.enqueue(-1);
        System.out.println(queue.peek());
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
        queue.print();
    }
}
