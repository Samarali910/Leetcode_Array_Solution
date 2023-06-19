package Array;

public class Absolute_Diff_K {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,4};
        System.out.println(countKDifference(arr,2));
    }
    public static int countKDifference(int[] nums, int k) {
         int count=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
}
