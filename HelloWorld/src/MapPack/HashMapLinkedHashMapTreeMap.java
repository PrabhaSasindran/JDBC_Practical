package MapPack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap {
    public static void main(String[] args){
        Map map = new HashMap();
        map.put("rama", 18);
        map.put("sita", 25);
        map.put("balayya",25);
        map.put(null,10);
        System.out.println(map);

        Map map1 = new LinkedHashMap();
        map1.put("rama", 18);
        map1.put("sita", 25);
        map1.put("balayya",25);
        System.out.println(map1);

        Map map2 = new TreeMap();
        map2.put("rama", 18);
        map2.put("sita", 25);
        map2.put("balayya",25);
        System.out.println(map2);

    }
}
