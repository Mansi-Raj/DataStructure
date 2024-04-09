package Strings;
import java.util.*;
public class PalindromeString {
    //1st method
    public boolean isPalindrome(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        while(j>i){
            if (s.charAt(i) != s.charAt(j)) {
                if (s.charAt(i)!=s.charAt(j)) return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    //2nd method
    public boolean isPalindrome2(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String newS=sb.toString();
        return newS.equals(s);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=s.next();
        PalindromeString p=new PalindromeString();
        System.out.println("From 1st method: "+p.isPalindrome(str));
        System.out.print("From 2nd method: "+p.isPalindrome2(str));
        s.close();
    }
}
