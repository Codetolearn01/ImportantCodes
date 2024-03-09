package Important;
import java.util.*;

public class sortBySetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        int[] p = sort(arr);
        for(int i =0;i<p.length;i++){
            System.out.print(p[i]+" ");
        }
    }
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i =n-1;i>0;i--){
            for(int j =0;j<i;j++){
                if(compare(arr[j],arr[j+1])>0){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr;
    }
    public static int compare(int a,int b){
        int CountA = bitsCount(a);
        int CountB = bitsCount(b);
        if(CountA!=CountB){
            return CountA - CountB;
        }
        else{
            return a-b;
        }
    }
    public static int bitsCount(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
