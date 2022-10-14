package Exception_Handling;

public class TryMultiCatch_4 {
    public static void main(String[] args) {
        int i=-1;
        int d=0;
        int[] arr = new int[1];
        try {
            //System.out.println(i/d);
            System.out.println(arr[i]);
        }catch (ArithmeticException ae) {
            System.out.println("Arithmetic");
        }
        catch (ArrayIndexOutOfBoundsException ob) {
            System.out.println("ArrayIndexOutOfBound");
        }
        catch (Exception e) {
            System.out.println("generic exception");
        }
    }
}
