package Array;

public class Sum_Multypl {
    public static void main(String[] args) {
        int n=7;
        System.out.println(sumOfMultiple(n));
    }
    public static int sumOfMultiples(int n) {
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%3==0){
                 sum+=i;
            } else if (i%5==0) {
                  sum+=i;
            } else if (i%7==0) {
                 sum+=i;
            }
        }
        return sum;
    }
// second way
    public static int sumOfMultiple(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%3==0||i%5==0||i%7==0){
                 sum+=i;
            }
        }
        return sum;
    }
}
