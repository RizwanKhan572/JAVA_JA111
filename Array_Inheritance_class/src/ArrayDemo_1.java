import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;

// Array is a collection of similar items or data types.
public class ArrayDemo_1 {

    public static void main(String[] args) {
       // Method 1 creating Array.

        // Syntax: Declaration
       // <datatype> [] <arrayName>
        int[] ages;                     // declared
        // Syntax: for creating
        // new <datatype> [size]

        ages= new int[5];                // created

       // int[] age= new int[10];  // both declaration and assigning value together.

        // Method 2 creating Array.

        String[] names= new String[3];
        Integer[] numbers= new Integer[4];
//        numbers[0]=100;
//        System.out.println(numbers[0]);



        for(int i=0; i<numbers.length; i++) {
            numbers[i]=i;
           // System.out.println(numbers[i]);
        }
        // when (not) to use array.
        // 1. I know the number of items.
        // 2. same data types.


        // Method 3 creating Array.

        String[] array= {"1","8","5"};
        //System.out.println(array[1]);

        // out of bound exception when value is -1 or greater than array.length.
        // iterating over an array
        // 1.for loop, while loop
        // 2.enhanced loop/ forEach loop
        // 3.special way or functional way
        int i=0;
        while (i<array.length) {
            System.out.println(array[i]);
            i++;
        }
        for (String nameCanBeAnything: array

             )
        {
           // System.out.println(nameCanBeAnything);
        }
        //Arrays.stream(array).forEach(item-> System.out.println(item)); // special way for iterating.

    }
}
