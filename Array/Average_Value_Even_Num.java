package Array;

public class Average_Value_Even_Num {
    public static void main(String[] args) {
        int arr[]={ 1,3,6,10,12,15};
        System.out.println(averageValue(arr));

    }
    public static int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
             if (nums[i]%2==0){
                 if (nums[i]%3==0){
                     sum+=nums[i];
                     count++;
                 }
             }
        }
        if (count==0){
            return 0;
        }
        return sum/count;
    }
}
