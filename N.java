//how to check two strings are rotation of each other or not
import java.util.*;
class A{
    public static void main(String[] args){
        String s1 = "aama";
        String s2 = "amar";
        System.out.println(checkRotation(s1,s2,s1.length(),s2.length()));
    }
    static boolean checkRotation(String s1,String s2,int l1, int l2){
        boolean flag = false; int x = 0;int count = 0;
        if(l1 == l2){
            for(int j = 0 ; j < l2 ; j++){
                if(s1.charAt(0) == s2.charAt(j)){
                    x = j;
                    break;
                }
            }
            for(int i = 0,j=x; i<l1 ; i++,j++){
                if(j==l2){
                    j=0;
                }
                count++;
                // System.out.println(i+" +++ "+j);
                if(s1.charAt(i) == s2.charAt(j)){
                    if(count == l1-1){
                        flag = true;
                    }
                }
            }
            
        }
        return flag;   
    }
}