import java.util.*;

public class Arrays_7 {
    // ArrayList, Set, LL, Q, Stack
    public static void main(String[] args) {

        int[] arr = {2,4,3,1,6,5};
        Arrays.sort(arr);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(arr));
        List<Integer> integerList=Arrays.asList(1,4,3,2);
        System.out.println(Arrays.binarySearch(arr,4));

        int[] b = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(b));
    }
}
