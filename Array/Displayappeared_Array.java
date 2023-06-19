package Array;
import java.util.*;
public class Displayappeared_Array {
    public static void main(String[] args) {
       int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
//          int i=0;
//          while (i< nums.length){
//              int j=nums[i]-1;
//              if (nums[i]!=nums[j]){
//                  swap(nums,i,j);
//              } else {
//                  i++;
//              }
//          }
//          List<Integer> ans=new ArrayList<>();
//        for (int j = 0; j <nums.length ; j++) {
//            if (nums[j]!=j+1){
//                ans.add(j+1);
//            }
//        }
//        return ans;
//    }
//    public static void swap(int nums[],int first,int second){
//        int temp=nums[first];
//        nums[first]=nums[second];
//        nums[second]=temp;
//    }
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int val:nums){
            hs.add(val);
        }
        int count=1;
        for(int val:nums){
            if(!hs.contains(count)){
                list.add(count);
            }
            count++;
        }
        return list;
    }
}
