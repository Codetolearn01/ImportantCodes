package Important;

import java.util.Scanner;

public class ClosestTo_5 {
    public static void main(String[] args) {
        //giving input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(compare(arr[j],arr[j+1])>0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //returning array
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int compare(int a, int b){
        int CountA= Math.abs(5-a);
        int CountB = Math.abs(5-b);
        if(CountA!=CountB){
            return CountA-CountB;
        }
        else{
            return a-b;
        }
    }
}
