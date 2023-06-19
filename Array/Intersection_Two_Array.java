package Array;
import java.util.*;
public class Intersection_Two_Array {
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        int arr2[]={2,2};
        System.out.println(Arrays.toString(intersection(arr,arr2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int [] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;
    }
}
