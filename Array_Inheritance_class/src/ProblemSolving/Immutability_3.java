package ProblemSolving;

public class Immutability_3 {

    public static void main(String[] args) {
        String s= "string";
        String temp =s;
        String s1= s.concat("muted");
        //System.out.println(s);
        //System.out.println(s);

        s="hi";  // it will create "hi" in another location in string pool.
        System.out.println(temp);
        String same= "string";
        System.out.println(same==s);  // Output:true because it will only crete new variable and
                                      // point the same content.


    }
}
