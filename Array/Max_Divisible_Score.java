package Array;

import java.util.Arrays;

public class Max_Divisible_Score {
    public static void main(String[] args) {
        int arr[]={31,91,47,6,37,62,72,42,85};
        int num[]={95,10,8,43,21,63,26,45,23,69,16,99,92,5,97,69,33,44,8};
        System.out.println(maxDivScore(arr,num));
    }
    public static int maxDivScore(int[] nums, int[] divisors) {
        int n=divisors.length;
        int i=0;
        int max=0;
        int count=0;
        int temp=0;
            while (i<n){
            count=0;
            for (int j = 0; j <nums.length ; j++) {

                 if((nums[j]%divisors[i])==0) {
                     count++;
                     if (max <count) {
                         max = count;
                         temp = divisors[i];
                     }
                 }
            }
            i++;
        }
        if (count==0){
            Arrays.sort(divisors);
            return divisors[0];
        }
        return temp;
    }
}
