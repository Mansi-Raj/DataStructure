package Search;

import java.util.*;

public class Sqrt {
    public int mySqrt(int x){
        if(x==0) return 0;
        int start=1;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid>x/mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int x=s.nextInt();
        Sqrt o=new Sqrt();
        System.out.print("Square root is "+o.mySqrt(x));
        s.close();
    }
}
