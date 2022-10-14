package Exception_Handling;

public class Throw_8 {
    public static void main(String[] args) {

        int age=20;
        if(age<18) {
            throw new ArithmeticException("Below 18 is not allowed in masai");
        }
        else {
            System.out.println("Eligible for masai");
        }
    }
}
