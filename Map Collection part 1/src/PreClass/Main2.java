package PreClass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(null,"four");
        Set<Integer>  keys= hm.keySet();  // for all keys
        System.out.println(keys);
        Collection<String> values =hm.values(); // for all values
        Set<Map.Entry<Integer,String>> set =hm.entrySet(); // for all key value pair
        System.out.println(set);
        for (Map.Entry<Integer,String> all: set) {
            System.out.println(all);              // iteration for all key value pairs in a hashmap
        }
        System.out.println(hm);
        System.out.println(values);
        for (String s: values) {
            System.out.println(s);
        }

    }
}
