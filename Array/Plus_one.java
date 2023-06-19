package Array;
import java.util.Arrays;
public class Plus_one {
    public static void main(String[] args) {
        int arr[]={9,9};
        System.out.print(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
