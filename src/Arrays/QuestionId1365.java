package Arrays;
import java.util.*;

public class QuestionId1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[]result=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for (int num : nums) {
                if (nums[i] > num) count++;
            }
            result[i]=count;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=s.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=s.nextInt();
        }
        QuestionId1365 q=new QuestionId1365();
        int[]result=q.smallerNumbersThanCurrent(num);
        System.out.print("Count of smaller than current number: "+Arrays.toString(result));
        s.close(); 
    }
}
