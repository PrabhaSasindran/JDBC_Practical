package CollectionsPack;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        List vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector.size());
        System.out.println(vector.contains(20));
        System.out.println(vector.get(2));
        vector.remove(2);
        System.out.println(vector.get(1));
        System.out.println(vector.size());
        System.out.println(vector);
    }
}
