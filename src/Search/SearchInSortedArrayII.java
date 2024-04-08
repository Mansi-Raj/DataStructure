package Search;
import java.util.*;

public class SearchInSortedArrayII {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(target==nums[mid]){
                return true;
            }else if(target<nums[mid]){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return false;
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
        System.out.print("Enter target: ");
        int target=s.nextInt();
        SearchInSortedArrayII sa=new SearchInSortedArrayII();
        System.out.print(sa.search(a,target));
        s.close();
    }
}
