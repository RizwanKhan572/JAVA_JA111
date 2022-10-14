
//Exception Handling.
/*
1.syntactical error
2.logical error
 */
/*
1.Normal Termination --> when last line of the statement is executed successfully.
2.Abnormal Termination --> when execution terminated before the last line of the statement of main method.
 */

// Exception classes in packages
/*
1.java.lang.ArithmaticException
2.java.lang.ArrayIndexOutOfBoundException
3.java.lang.NullPointerException
4.java.lang.ClassCastException
5.java.lang.NumberFormatException
6.java.io.IOException
7.java.sql.SqlException

 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Main Method");
      try {
          int x = 100;
          int y = 0;
          int z = x / y;

          System.out.println("result is " + z);
      }catch (ArithmeticException ae) {
          System.out.println("inside catch block");
          System.out.println(ae.getMessage());
      } finally {
          // it will be definitely terminated no matter exception comes or not.
      }
        System.out.println("Ending of Main Method");
    }

}
