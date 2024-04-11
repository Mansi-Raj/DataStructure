package PatternQuestions;
import java.util.*;

public class PatternQuestion3 {
    public void pattern15(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(j==n-i-1){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<n+i;j++){
                if(j==n+i-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        for(int i=n;i<2*n-1;i++){
            for(int j=0;j<n;j++){
                if(j==i-n+1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=2*n-3;j>=n;j--){
                if(j==i){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern16(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            int a=1;
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a=a*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public void pattern17(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i){
                    System.out.print(" "+" ");
                }else{
                    System.out.print(n-j+" ");
                }
            }
            for(int j=n;j<2*n-2;j++){
                if(j<n+i-1){
                    System.out.print(j-n+2+" ");
                }
            }
            System.out.println();
        }

        for(int i=n;i<2*n-1;i++){
            for(int j=0;j<n;j++){
                if(j>i-n+1){
                    System.out.print(n-j+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=2*n-3;j>=n;j--){
                if(j>i){
                    System.out.print(j-n+1+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n=s.nextInt();
        PatternQuestion3 p=new PatternQuestion3();
        p.pattern15(n);
        System.out.println();
        p.pattern16(n);
        System.out.println();
        p.pattern17(n);
    }
}
