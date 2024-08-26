package CollectionsPack;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(10);
        queue.add(8);
        queue.add(2);
        queue.add(30);
        queue.add(100);
        queue.add(60);
        System.out.println(queue.size());
        System.out.println(queue.contains(20));
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue);
    }
}
