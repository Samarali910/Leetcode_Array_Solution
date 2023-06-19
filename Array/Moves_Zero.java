package Array;

//Leetcode 183
public class Moves_Zero {
    public static void main(String[] args) {
       int arr[]={1,0,2,0,3,4};
       moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int count=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]!=0) {
                nums[count++] = nums[i];
            }
        }
        while(count< nums.length){
            nums[count++]=0;
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+" ");
        }
    }
}
