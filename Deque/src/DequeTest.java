import ds.Deque;

public class DequeTest {

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.enqueue(10);
        deque.enqueue(20);
        deque.enqueue(30);
        deque.enqueueRear(5);
        deque.enqueueRear(2);
        deque.print();
        deque.dequeueFront();
        deque.dequeueFront();
        deque.print();
    }
}
