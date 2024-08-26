package MapPack;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args){
        Map map = new Hashtable();
        map.put("rama",18);
        map.put("sita",25);
        map.put(null,26);
        System.out.println(map);
    }
}
