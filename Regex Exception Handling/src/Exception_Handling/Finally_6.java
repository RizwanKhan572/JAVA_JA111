package Exception_Handling;

public class Finally_6 {
    //finally block always be executed whether
    // an exception is handled or not it contains
    // all the necessary statements that should be
    // executed regardless of the exception occurs or no
    public static void main(String[] args) {
        int i=-1;
        int[] arr =new int[1];
        try {
            System.out.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException aob) {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally will always be executed");
        }

    }
    // try - catch
    // try -multiCatch
    // nested try -catch
    // try - catch - finally
    // try - finally
}
