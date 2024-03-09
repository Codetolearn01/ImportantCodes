package Important;


import java.util.*;

public class DisappearingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       List<Integer> prr = elements(arr);
        for(int i : prr){
            System.out.print(i+" ");
        }
    }
    public static List<Integer> elements(int[] arr){
        int n = arr.length;
        List<Integer> miss = new ArrayList<>();
        for(int i =0;i<n;i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index]>0){
                arr[index]=-arr[index];
            }
        }
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                miss.add(i+1);
            }
        }
        return miss;
    }
}
