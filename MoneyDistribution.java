package Important;

import java.util.Scanner;

public class MoneyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int count = 0;
        for(int i =1;n-sum>=i*i;i++){
            sum +=i*i;
            count++;
        }
        System.out.println(count);
    }
}
