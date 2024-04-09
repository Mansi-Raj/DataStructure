package Strings;
import java.util.*;

public class Q1528 {
    //method 1
    public String restoreString(String s, int[] indices) {
        char[] c=s.toCharArray();
        int n=s.length();
        char[] newC=new char[n];
        int i=0;
        while(i<n){
            int j=indices[i];
            newC[j]=c[i];
            i++;
        }
        return String.valueOf(newC);
    }

    //method2
    public String restoreString2(String s,int[]indices){
        char[] c=new char[s.length()];
        for (int i=0;i<s.length();i++){
            c[indices[i]]=s.charAt(i);
        }

        return new String(c);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=s.next();
        System.out.print("Enter the indices: ");
        int[]indices=new int[str.length()];
        for (int i=0;i<str.length();i++) indices[i]=s.nextInt();

        Q1528 q=new Q1528();

        System.out.println("from 1st method: "+q.restoreString(str, indices));
        System.out.println("from 2nd method: "+q.restoreString2(str, indices));
    }
}
