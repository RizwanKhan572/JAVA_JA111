import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetVsLinkedHashSet_6 {
    public static void main(String[] args) {
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("mumbai");
        hashSet.add("delhi");
        hashSet.add("kolkata");
        hashSet.add("goa");
        hashSet.add("mumbai");  // duplicate item
        hashSet.add("null");   // adding null;
        hashSet.add("bangalore");
        hashSet.add("hyderabad");
        System.out.println(hashSet);

        System.out.println("================");

        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();

        linkedHashSet.add("mumbai");
        linkedHashSet.add("delhi");
        linkedHashSet.add("kolkata");
        linkedHashSet.add("goa");
        linkedHashSet.add("mumbai");  // duplicate element
        linkedHashSet.add("null");    // adding null
        linkedHashSet.add("bangalore");
        linkedHashSet.add("hyderabad");
        System.out.println(linkedHashSet);

        // only diff is b/w HashSet and LikedHashSet is
        // HashSet : doesn't care about order.
        // LinkedHashSet : it is ordered.
    }
}
