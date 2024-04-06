package BinarySearch;
import java.util.*;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int start=0;
        int end=n-1;
        int[]result=new int[2];
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                result[0]=start+1;
                result[1]=end+1;
            }
            if(numbers[start]+numbers[end]<target){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        System.out.println("Enter the elements of array:");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        System.out.print("Enter the target: ");
        int target=s.nextInt();
        TwoSumII t=new TwoSumII();
        int[]result=t.twoSum(nums,target);
        System.out.print("Result: "+Arrays.toString(result));
        s.close();
    }
}
