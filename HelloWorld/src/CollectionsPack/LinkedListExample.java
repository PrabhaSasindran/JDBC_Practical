package CollectionsPack;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list);
    }
}
