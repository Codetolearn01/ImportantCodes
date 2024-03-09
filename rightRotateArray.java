package Important;

import java.util.Scanner;

public class rightRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
//        int[] prr = BruteForce(arr,k);
//        int[] prr = BetterSol(arr,k);
        int[] prr = Optimise(arr,k);

        for (int j : prr) {
            System.out.print(j + " ");
        }
    }
    public static int[] BruteForce(int[] arr, int k){
        int n = arr.length;
        for(int i =0;i<k;i++){
            int temp = arr[n-1];
            for(int j =n-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        return arr;
        //Time complexity : O(n*k)
        //space complexity : O(1)
    }
    public static int[] BetterSol(int[] arr,int k){
        int n= arr.length;
        k = k%n;
        int[] temp = new int[k];
        for(int i =n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i = n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        return arr;
        //Time complexity : O(n)
        //space complexity : O(k)
    }
    public static int[] Optimise(int[] arr,int k){
        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        return arr;
    }
    public static int[] reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
        //Time complexity : O(n)
        //space complexity : O(1)
    }

}
