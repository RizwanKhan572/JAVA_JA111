import java.util.Stack;

public class Stack_4 {
    public static void main(String[] args) {
        //lifo
        Stack<Integer> stack= new Stack<>();
        stack.add(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.pop());  // removes item from top -- don't use pop in stack
        System.out.println(stack);
        System.out.println(stack.peek());  // print top element

    }
}
