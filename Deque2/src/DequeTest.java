import ds2.Deque;

import java.util.ArrayList;
import java.util.List;

public class DequeTest {

    /* For constants: UPPER CASE */
    public static final int DAYS_OF_MONTH = 30;

    public static int customer_age = 10;        // This is wrong
    public static String customerName;          // In Java, we use camel cases for fields and methods

    // package names are always in lowercase

    // int[] queueArray;

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
