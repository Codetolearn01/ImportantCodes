package Important;
import java.util.*;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor");
        int divisor = sc.nextInt();
        int res = divide(dividend,divisor);
        System.out.println("The value of Quotient : "+res);

    }
    public static int divide(int dividend, int divisor){
        int n = dividend;
        int d = divisor;
        if(n==Integer.MIN_VALUE && d == -1){
            return Integer.MAX_VALUE;
        }

        int sign = (n>=0)^(d>=0)?-1:1;

        int res =0;
        while(n-d>=0){
            int count =0;
            while(n-(d<<1<<count)>=0){
                count++;
            }
            res += 1<<(count);
            n -= d<<(count);
        }
        return sign*res;
    }
}
