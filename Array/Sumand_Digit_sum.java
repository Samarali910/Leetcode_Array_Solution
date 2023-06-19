package Array;

public class Sumand_Digit_sum {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(differenceOfSum(arr));
    }
    public static int differenceOfSum(int[] nums) {
         int elesum=0;
        int digit_sum=0;
         for(int i:nums){
             elesum+=i;
             while (i!=0){
                  int rem=i%10;
                  digit_sum+=rem;
                  i=i/10;
             }
         }
         return Math.abs(elesum-digit_sum);
    }
}
