
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main2 {

    public static void main(String[] args) {
        int count=0;
        Pattern p =Pattern.compile("[abc]");
        Matcher m=p.matcher("cdabkb");

        while (m.find()) {
               count++;
            System.out.println(m.start()+"----"+m.group());

        }
        System.out.println(count);
    }
}
