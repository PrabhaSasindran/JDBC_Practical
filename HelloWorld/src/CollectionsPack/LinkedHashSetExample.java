package CollectionsPack;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args){
        Set set = new LinkedHashSet();
        System.out.println(set.add(10));
        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(60));
        System.out.println(set.add(50));
        System.out.println(set.add(20));
        System.out.println(set.size());
        System.out.println(set);
    }
}
