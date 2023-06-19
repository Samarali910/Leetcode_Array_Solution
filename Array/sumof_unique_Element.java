package Array;


import java.util.HashSet;

//[10,6,9,6,9,6,8,7]
public class sumof_unique_Element {
    public static void main(String[] args) {
         int arr[]={1,2,3,2};
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int count=1;
        int dupnum=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j =i+1; j <nums.length ; j++) {
                  if(nums[i]==nums[j]){
                      count++;
                      if (count>1){
                          dupnum=nums[i];
                          hs.add(dupnum);
                      }
                  }
            }
        }
        int sum=0;
        for (int i:nums){
             if (!hs.contains(i)){
                 sum+=i;
             }
        }
        return sum;
    }
}
