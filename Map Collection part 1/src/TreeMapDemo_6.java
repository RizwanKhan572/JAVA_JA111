import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo_6 {
    public static void main(String[] args) {
        Map<Integer,Integer> hashMap =new HashMap<>();
        hashMap.put(0,1);
        hashMap.put(2,4);
        hashMap.put(1,1);

        hashMap.put(3,9);
        hashMap.forEach((k,v)-> System.out.println(k+"-->"+v));

        Map<Integer,Integer> treeMap =new TreeMap<>();
        treeMap.put(0,1);
        treeMap.put(2,4);
        treeMap.put(1,1);

        treeMap.put(3,9);
        treeMap.forEach((k,v)-> System.out.println(k+"-->"+v));
    }
}
