package Arrays;

import java.util.*;

public class EvenNoOfDigits {
    public int evenDigitInt(int[]a){
        int count=0;
        for (int j : a) {
            if (String.valueOf(j).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=s.nextInt();
        int[] a=new int [n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        EvenNoOfDigits e=new EvenNoOfDigits();
        System.out.print("Count of integer which contains even digits: "+e.evenDigitInt(a));
        s.close();
    }
}
