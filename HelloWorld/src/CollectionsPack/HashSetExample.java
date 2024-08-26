package CollectionsPack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        System.out.println(set.add(10));
        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(60));
        System.out.println(set.add(50));
        System.out.println(set.add(20));
        System.out.println(set.size());
        System.out.println(set);
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
