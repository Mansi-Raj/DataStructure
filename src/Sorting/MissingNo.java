package Sorting;
import java.util.*;

public class MissingNo {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int num:nums) sum-=num;
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=s.nextInt();
        int[] num=new int[n];
        System.out.print("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            num[i]=s.nextInt();
        }
        MissingNo m=new MissingNo();
        System.out.print("Missing no: "+m.missingNumber(num));
        s.close();
    }
}
