package Array;

public class Count_Equal_divisible {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(countPairs(arr,1));
    }
    public static int countPairs(int[] nums, int k) {
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j] && (i*j)%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}
