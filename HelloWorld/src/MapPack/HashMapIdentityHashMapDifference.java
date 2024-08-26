package MapPack;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapIdentityHashMapDifference {
    public static void main(String[] args){
        String s = new String("Raj");
        String s1 = new String("Raj");
        Map map = new HashMap<>(); //equals()
        map.put(s, 18);
        map.put(s1,25);
        System.out.println(map);
        System.out.println(map.size());
        Map map1 = new IdentityHashMap(); //==
        map1.put(s,18);
        map1.put(s1,25);
        System.out.println(map1.size());
        System.out.println(map1);
    }
}
