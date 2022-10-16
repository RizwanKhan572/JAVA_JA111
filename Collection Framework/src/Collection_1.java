import java.util.*;

public class Collection_1 {

    public static void main(String[] args) {
        // initial capacity (10) size for List. once it fill 75% it will increase its capacity by double.
        List<Integer> list =new ArrayList<>();    // dynamic array : variable size
        Object[] objArray = list.toArray();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> anotherList =Arrays.asList(0,1,2,3,4);
//        list.addAll(anotherList);    // for adding another list to the list.
        System.out.println(list.contains(2));  // it will return boolean value;
        System.out.println(list.containsAll(anotherList)); // if all elements will be present then it will return true.
        //list.removeAll(anotherList); // it will remove all common elements from list.
        System.out.println(list);
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

            // List: allow dups ,allow null;
            //ArrayList: Internally it's an array based on index access.
            // Delete index: O(n)
            // LinkedList:
            // lookup, search,access: O(n);
            // insert,delete at very first: O(1);

            // list vs set
            // allows dups, doesn't
            // index based access ,doesn't have it

            list.get(0);
           Set<Integer> set =new HashSet<>();
           set.add(0);
           // set.get(0) set doesn't have index based access.

            // autoboxing , unboxing

        }

    }


}

// Collection: add(), remove(), size, empty ,clear();

// List, Set...
