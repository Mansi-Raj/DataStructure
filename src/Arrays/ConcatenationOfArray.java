package Arrays;
import java.util.*;
public class ConcatenationOfArray {
    public int[] concatenationOfArray(int[]nums){
        int n=nums.length;
        int[] result=new int[2*n];
        for (int i=0;i<2*n;i++){
            if(i<n){
                result[i]=nums[i];
            }else{
                result[i]=nums[i-n];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=s.nextInt();
        System.out.println("Enter the elements of array:");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        ConcatenationOfArray c=new ConcatenationOfArray();
        int[] result=c.concatenationOfArray(nums);
        System.out.print(Arrays.toString(result));
        s.close();
    }
}
