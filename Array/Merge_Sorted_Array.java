package Array;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0};
        int nums2[]={2,5,6};
        merge(nums1,nums1.length,nums2,nums2.length);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=nums1.length-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            } else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        for (int l = 0; l <nums1.length ; l++) {
            System.out.print(nums1[l]+" ");
        }
    }
}
