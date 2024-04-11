package PatternQuestions;
import java.util.*;

public class PatternQuestions2 {
    public void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            for(int j=2*n-2-i;j>=n;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public  void pattern10(int n){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public void pattern11(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public void pattern12(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = n; i < 2*n; i++) {
            for(int j=0;j<2*n-i;j++) System.out.print(" ");
            for(int j=0;j<=i-n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public void pattern13(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(i==n-1||j==n-i-1){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<n+i;j++){
                if(i==n-1||j==n+i-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern14(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==i){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<2*n-1;j++){
                if(i==0||j==2*n-i-2){
                    System.out.print("*"+" ");
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
        PatternQuestions2 p=new PatternQuestions2();
        p.pattern9(n);
        System.out.println();
        p.pattern10(n);
        System.out.println();
        p.pattern11(n);
        System.out.println();
        p.pattern12(n);
        System.out.println();
        p.pattern13(n);
        System.out.println();
        p.pattern14(n);
    }
}
