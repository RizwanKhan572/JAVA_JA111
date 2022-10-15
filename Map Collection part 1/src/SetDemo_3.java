import java.util.HashSet;
import java.util.Set;

public class SetDemo_3 {
    // set is a data structure in java
    // set is a collection of similar type of items.

    // set Integer:{1,2,3};
    // may or may not be ordered
    // dosen't have duplicates
    // if the size of the ds is unknown

    public static void main(String[] args) {
        // initial capacity 16 items.
        // Load factor 75% capacity will increase by double

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.size();
        set.add(3);
        set.size();
        System.out.println("end");
        set.remove(1);
        set.contains(2);
        set.isEmpty();

        for(int i=0; i<15; i++) {
            set.add(i);
        }

        set.forEach(item-> System.out.println(item));  // special type for iteration.

    }
}
