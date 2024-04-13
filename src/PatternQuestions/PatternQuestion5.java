package PatternQuestions;
import java.util.*;

public class PatternQuestion5 {
    public void pattern24(int n){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(j==0||j==i){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<2*n;j++){
                if(j==2*n-i-1||j==2*n-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

        for(int i=n;i<2*n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==2*n-i-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<2*n;j++){
                if(j==i||j==2*n-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern25(int n ){
        for(int i=0; i<n;i++){
            for(int j=0;j<n-i-1;j++) System.out.print(" "+" ");
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern26(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n=s.nextInt();
        PatternQuestion5 p=new PatternQuestion5();
        p.pattern24(n);
        System.out.println();
        p.pattern25(n);
        System.out.println();
        p.pattern26(n);
    }
}
