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
        System.out.println(stack.empty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.clear();
        System.out.println(stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        System.out.println(stack.contains(55));
    }
}
