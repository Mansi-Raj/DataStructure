package Sorting;
import java.util.*;

public class QuestionId217 {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(nums[i]==nums[j])return true;
        }
        return false;
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
        QuestionId217 q=new QuestionId217();
        System.out.print(q.containsDuplicate(num));
        s.close();
    }
}
