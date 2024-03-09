package Important;

import java.util.Scanner;

// check for same alphabets are there in two strings
public class isAnagram {
    public static void main(String[] args) {
//        String s = "stop";
//        String t = "tops";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean res = isItAnagram(s,t);
        System.out.println(res);

    }
    public static boolean isItAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] count =new int[26];
        for(int i =0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i =0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i =0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
