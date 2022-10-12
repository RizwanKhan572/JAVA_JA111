

public class String_6 {

    public static void main(String[] args) {


        String s1= "Masai";    // String literal
        String s2= "Masai";
        // String literal are created in string pool (PERMGEN)
        // string pool [] doesn't allow duplicate.
        String s3 = new String("Masai");  // String with new operator
        String s4= new String("Masai");
        System.out.println(s4==s3);  //== compare addresses of the variable.

        // In the heap area a new object is created.
    }
}
