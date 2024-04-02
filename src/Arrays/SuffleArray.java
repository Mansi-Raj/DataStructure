package Arrays;
import java.util.*;
public class SuffleArray {
    public int[] suffle(int []num){
        int n=num.length/2;
        int[]result =new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i]=num[i];
            result[2*i+1]=num[n+i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=s.nextInt();
        System.out.print("Enter the elements of array: ");
        int[] num=new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            num[i]=s.nextInt();
        }
        SuffleArray sa=new SuffleArray();
        int[]result= sa.suffle(num);
        System.out.print("Suffled Array: "+ Arrays.toString(result));
        s.close();
    }
}
