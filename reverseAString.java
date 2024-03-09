package Important;

import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ptr = reverseWords(s);
        System.out.println(ptr);
    }

    public static String reverseWords(String s) {
        int left = 0;
        int right = s.length()-1;

        String temp = "";
        String ans = "";


        while(left<=right){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp+=ch;
            }
            else{
                if(!ans.equals("")){
                    ans = temp+" "+ans;
                }
                else{
                    ans = temp;
                }
                temp="";
            }
            left++;
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans = temp+" "+ans;
            }
            else{
                ans = temp;
            }
        }
        return ans;
    }
}
