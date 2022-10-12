

public class PrintSumAndAverageOfArrayItems_2 {

    public static void main(String[] args) {

        Integer[] numbers= {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i=0; i<numbers.length; i++) {
            sum+=numbers[i];
        }
        double avg= sum/numbers.length;
        System.out.println("sum is "+sum);
        System.out.println("avg is "+avg);
    }
}
