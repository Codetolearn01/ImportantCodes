package Important;

import java.util.Scanner;

public class MaxNoOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.println(maxWords(arr));
    }
    public static int maxWords(String[] sentences){
        int max = 0;
        for(String str : sentences){
            int words = 1;
            for(char c : str.toCharArray()){
                if(c==' '){
                    words++;
                }
            }
            if(max<words){
                max = words;
            }
        }
        return max;
    }
}
