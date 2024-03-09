package Important;

import java.util.Scanner;

public class isFirstAndLastSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(isTrue(num));

    }

    public static boolean isTrue(int num){
        int val = num;
        if((val&1)==1){
            while(val>2){
                val>>=1;
//                if((val&1)==1){
////                    System.out.println(false);
//                    return false;
//                }
//                System.out.println(val);
            }
//            System.out.println(val);
            if(((val>>1)&1)!=1){
//                return false;
//                System.out.println(false);
                return false;
            }
        }
        else{
//            return false;
//            System.out.println(false);
            return false;
        }
        return true;
//        System.out.println(true);
    }

}

