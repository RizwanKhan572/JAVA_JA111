package Exception_Handling;

public class CheckedAndUncheckedException_2 {
  // 2 type of exception there checked and unchecked.
    // 1.Checked or compile time exception
    /*
    1.IOException
    2.SqlException
    3.ClassNotFoundException
     */
    // 2. Unchecked exception or runtime exception.
    /*
    1.ArithmeticException
    2. NullPointerException.
     */

    NullPointerException e;
    public static void main(String[] args) {

        int[] arr= {2,6,7,8};
        System.out.println(arr[-1]);  // ArrayIndexOutOfBoundException
        String number = "123jhgk";

        System.out.println(Integer.parseInt(number));   // NumberFormatException
        Student s=null;

        System.out.println(s.toString());
    }

}
