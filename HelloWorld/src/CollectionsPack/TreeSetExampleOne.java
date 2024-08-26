package CollectionsPack;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExampleOne {
    public static void main(String[] args){
        Set set = new TreeSet();
        System.out.println(set.add(10));
        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(60));
        System.out.println(set.add(50));
        System.out.println(set.add(20));
        System.out.println(set);
    }
}
