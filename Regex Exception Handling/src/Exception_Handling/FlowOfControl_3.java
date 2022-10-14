package Exception_Handling;

public class FlowOfControl_3 {
    public static void main(String[] args) {
        int i=1;

        int[] arr=new int[10];
        try {
            System.out.println(arr[i]);
        }catch (Exception ob) {
            System.out.println("something");
        }
        System.out.println("next something");
    }


}
