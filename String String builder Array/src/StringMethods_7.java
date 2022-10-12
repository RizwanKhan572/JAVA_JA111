

public class StringMethods_7 {

    public static void main(String[] args) {
        String s1= "hi";
        String s2= "hello";
        // System.out.println(s1+s2);
        //System.out.println(s1.concat(s2));

        String s= "string";

        s.charAt(3);

        //System.out.println(s.substring(1,3));

        String s5="HelloThere";

        //System.out.println(s5.indexOf('T'));  // for index of particular char.

       // System.out.println(s5.lastIndexOf('o')); // if any char is repeated I can know it last index.
        String a= "STRING";
        System.out.println(a.equalsIgnoreCase(s)); // it ignores the case so it will be true;
        String b="   power of Rings  ";
//       System.out.println(b.trim()); // it removes stating spaces and ending spaces but not removes in between.
        System.out.println("power of rings".replace('p', 'P'));
        // It replaces char of string from old to new.


    }
}
