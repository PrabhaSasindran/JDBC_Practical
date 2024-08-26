package CollectionsPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        List list1 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list1.add(40);
        list1.add(50);
        System.out.println(list1.size());
        System.out.println(list.contains(20));
        list.addAll(list1);
        System.out.println(list.containsAll(list1));
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.get(2));
        list.removeAll(list1);
        System.out.println(list.size());
        System.out.println("Elements of list are");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("Iterator");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
           System.out.println(itr.next());
        }

    }
}
