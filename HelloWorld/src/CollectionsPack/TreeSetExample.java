package CollectionsPack;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        Set set = new TreeSet();
        System.out.println(set.add("Java"));
        System.out.println(set.add("Python"));
        System.out.println(set.add("Sql"));
        System.out.println(set.add("C"));
        System.out.println(set.add("Angular"));
        System.out.println(set);
    }
}
