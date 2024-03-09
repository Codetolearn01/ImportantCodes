package Important;

import java.util.Scanner;


//check for all the alphabets are included or not
public class panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res = isPanagram(str);
        System.out.println(res);
    }
    public static boolean isPanagram(String str){
        int[] count = new int[26];
        for(int i =0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int j =0;j<26;j++){
            if(count[j]==0){
                return false;
            }
        }
        return true;
    }
}
