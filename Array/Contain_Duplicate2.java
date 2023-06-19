package Array;

import java.util.HashMap;

public class Contain_Duplicate2 {
    public static void main(String[] args) {
       int []arr={1,2,3,1};
        System.out.println(containsNearbyDuplicate(arr,3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && Math.abs(hm.get(nums[i])-i)<=k)return true;
            hm.put(nums[i],i);
        }
        return false;
    }
}
