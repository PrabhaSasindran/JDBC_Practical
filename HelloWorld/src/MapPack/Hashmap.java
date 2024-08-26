package MapPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.put(1,"raj"));
        System.out.println(map.put(2,"raja"));
        System.out.println(map.put(2,"rajam"));
        System.out.println(map.put(3,"rama"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue("rajam"));
        System.out.println(map.containsKey(2));
        System.out.println(map.get(2));
        System.out.println(map);
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+"   "+m.getValue());
        }
        map.clear();;
        System.out.println(map.size());
    }
}
