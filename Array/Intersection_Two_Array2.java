package Array;
import java.util.*;
public class Intersection_Two_Array2 {
    public static void main(String[] args) {
       int []nums1={1,2,2,1};
       int nums2[]={2,2};
//        System.out.println(Arrays.toString(intersect(nums1,nums2)));
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
//    public static int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> intersection = new ArrayList<>();
//
//        for (int num : nums1) {
//            list.add(num);
//        }
//        for (int num : nums2) {
//            if (list.contains(num)) {
//                intersection.add(num);
//                int x = list.indexOf(num);
//                list.remove(x);
//            }
//        }
//        int[] ans = new int[intersection.size()];
//        for (int i = 0; i < intersection.size(); i++) {
//            ans[i] = intersection.get(i);
//        }
//        return ans;
//    }

//    second way
                  public static int[] intersect(int[] nums1, int[] nums2) {
                      int l1 = nums1.length;
                      int l2 = nums2.length;
                      int i = 0, j = 0, k = 0;
                      Arrays.sort(nums1);
                      Arrays.sort(nums2);
                      while (i < l1 && j < l2)

                          if (nums1[i] < nums2[j]) {
                              i++;
                          } else if (nums1[i] > nums2[j]) {
                              j++;
                          } else {
                              nums1[k++] = nums1[i++];
                              j++;
                          }
                      return Arrays.copyOfRange(nums1, 0, k);
                  }
}
