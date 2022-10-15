
import java.util.Scanner;

public class CustomException_2 {

    public static void main(String[] args) {

        try {
            validateEmail();
        }catch (DuplicateEmailException e) {
            e.printStackTrace();
        }
    }
    static void validateEmail() throws DuplicateEmailException {
        Scanner sc = new Scanner(System.in);
        String[] emails= {"abc@123","rizwan#123"};
        System.out.println("Enter your Email");
        String email= sc.next();

        for (String e:emails
             ) {
            if(email.equals(e)) {
                throw new DuplicateEmailException("Email already exist");
            }
        }

    }
}

class DuplicateEmailException extends Exception {

    public DuplicateEmailException(String message) {
        super(message);
    }

    public DuplicateEmailException() {}
}