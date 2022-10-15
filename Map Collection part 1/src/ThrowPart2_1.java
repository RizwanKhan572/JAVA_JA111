import java.io.IOException;

public class ThrowPart2_1 {
    public static void main(String[] args) /*throws IOException ->whichever is calling main will handling it */ {
         // we can use try - catch here for handling the exception
        try {
            validate(29);
        } catch (IOException e) {
            System.out.println("To cast your age should be atleast 18");
        }
    }

    static void validate(int age) throws IOException {
        if(age<18) {
            // we can use try - catch here for handling the exception
            throw new IOException("age < 18");
        }
        else {
            System.out.println("You can cast your vote");
        }
    }
}
