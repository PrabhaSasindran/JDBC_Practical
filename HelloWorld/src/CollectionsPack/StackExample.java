package CollectionsPack;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println(stack.contains(20));
        System.out.println(stack.get(2));
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
