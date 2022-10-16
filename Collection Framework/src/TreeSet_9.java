import java.util.Set;
import java.util.TreeSet;

// need to see Arjun's repo day 14 and last video of the unit of last 5 min of it.
public class TreeSet_9 {

    public static void main(String[] args) {
        Set<String> ts= new TreeSet<>();   // Sorted set always
        ts.add("India");
        ts.add("England");
        ts.add("China");
        ts.add("Canada");
        ts.add("France");
        System.out.println(ts);
    }

    // comparator: it is used to overcome with treeSet limitations.
    // in tree set we can sort according to using only one item.
    // but comparator can handle it.
    // comparator: not covered.
}
