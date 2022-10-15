import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterateOverMap_5 {
    public static void main(String[] args) {
        Map<Integer,Integer> map =new HashMap<>();
        map.put(0,1);
        map.put(1,1);
        map.put(2,4);
        map.put(3,9);
        System.out.println(map.get(2));
        // map.clear --> erase
        // no dups in a map
        map.put(2,20);

        System.out.println(map.get(100));
        Integer defaultValue =map.getOrDefault(100,-1); // defaultValue -1;
        // iterate
        System.out.println(map);
                 Set<Integer> keySet =map.keySet();
        System.out.println(keySet);

        for (Integer key:keySet
             ) {
            System.out.println(key+"=====>"+map.get(key));
        }

        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer,Integer> entry:entrySet
             ) {
            System.out.println(entry.getKey()+"->"+entry.getKey());
        }
        System.out.println("Lambda way");
        // 3 using lambda
        map.forEach((k,v)-> System.out.println(k+"-->"+v));

        // 4th way
        System.out.println("keySet way");
        map.keySet().forEach(key-> System.out.println(key+"-->"+map.get(key)));
    }
}

// TreeMap : sortedMap: need comparator
