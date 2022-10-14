package Exception_Handling;

public class ExceptionHandlingDemo_1 {

    public static void main(String[] args) {

        System.out.println("one");
        try {
            System.out.println(1 / 0);
        }catch (Exception ae) {
            System.out.println("divided by Zero error");
        }
        System.out.println("two");
    }
}


