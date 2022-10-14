
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main1 {

    public static void main(String[] args) {

        int count=0;
        Pattern p= Pattern.compile("ab");
        Matcher m= p.matcher("abbababbaab");

        while(m.find()) {
            count++;
            System.out.println(m.start()+"-----"+m.end()+"------"+m.group());
        }
        System.out.println("there's no occurences: "+count);
    }

}
