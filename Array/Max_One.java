package Array;

public class Max_One {
    public static void main(String[] args) {
      int arr[]={1,1,1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int  maxcountone=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==1){
                count++;
            }else{
                  maxcountone=Math.max( maxcountone,count);
                 count=0;
            }
        }
        return Math.max( maxcountone,count);
    }
}
