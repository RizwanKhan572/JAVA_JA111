package YouProblem;

public class GetMaximumElementInAnArray {

   int biggestNum(int[] nums) {
       int max= Integer.MIN_VALUE;
       if (nums.length==0) {
           System.out.println("array is empty");
           // throw NoSuchElementException
           return max;
       }
       for(int i=0; i<nums.length; i++) {
        if(max<nums[i]) {
            max=nums[i];
        }

       }
       return max;
   }
    public static void main(String[] args) {
        int[] nums={1,5,9,3};


       GetMaximumElementInAnArray m1= new GetMaximumElementInAnArray();
        System.out.println(m1.biggestNum(nums));

    }
}
