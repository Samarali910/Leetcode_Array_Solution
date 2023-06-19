package Array;


 import java.util.*;

//   Input: nums = [13,25,83,77]
//Output: [1,3,2,5,8,3,7,7]
public class Seprete_The_Digit {

    public static void main(String[] args) {
      int arr[]={ 13,25,12,34};
//        System.out.println(Arrays.toString(separateDigits(arr)));
        System.out.println(Arrays.toString(separateDigits(arr)));

    }
    public static int[] separateDigits(int[] nums){

            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> list = new ArrayList<>();

            for (int x : nums) {

                while (x > 0) {
                    int rem = x % 10;
                    stack.push(rem);
                    x /= 10;
                }

                while (!stack.isEmpty()) {
                    list.add(stack.pop());
                }
            }
            int index = 0;
            int[] ans = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                ans[index++] = list.get(i);
            }
            return ans;

    }
}
