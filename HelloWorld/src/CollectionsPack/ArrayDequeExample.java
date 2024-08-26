package CollectionsPack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args){
        Deque deque = new ArrayDeque();
        deque.addFirst(10);
        deque.addFirst(5);
        deque.addFirst(20);
        deque.addFirst(30);
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.size());

    }
}
