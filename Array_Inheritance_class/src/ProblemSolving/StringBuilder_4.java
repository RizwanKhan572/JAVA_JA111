package ProblemSolving;

public class StringBuilder_4 {

    public static void main(String[] args) {
        // 2 ways to convert to stringBuilder to string;
        //1
        StringBuilder builder= new StringBuilder("value");
        String s=builder.toString();
        //System.out.println(s);
        //2
        String ss= new String(builder);
        String x="asdf";

        //  converts string to stringBuilder.
        StringBuilder b= new StringBuilder(x);
        System.out.println(b);

    }
}
