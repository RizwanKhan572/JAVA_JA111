package PreClass;


import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(null,"four");
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        // hm.put(null,"nine");   // if we put  same key again then value will be replaced.
        System.out.println(hm);
    }
}
