package Array;

 import java.util.*;

public class TargetArrayingiven_order {
    public static void main(String[] args) {
         int arr[]={0,1,2,3,4};
         int index[]={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
             list.add(index[i],nums[i]);
        }
        int result[]=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
                result[i]=list.get(i);
        }
        return result;
    }
}
