import ds.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.empty());
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
    }
}
