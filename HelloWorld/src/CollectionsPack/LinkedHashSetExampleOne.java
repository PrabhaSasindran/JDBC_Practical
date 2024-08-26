package CollectionsPack;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExampleOne {
    public static void main(String[] args){
        Set set = new LinkedHashSet();
        System.out.println(set.add("Java"));
        System.out.println(set.add("Python"));
        System.out.println(set.add("Sql"));
        System.out.println(set.add("C"));
        System.out.println(set.add("Angular"));
        System.out.println(set);
    }
}
