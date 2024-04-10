package PatternQuestions;
import java.util.*;

public class PatternQuestions {
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) System.out.print("*"+" ");
            System.out.println();
        }
    }

    public void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print("*" + " ");
            System.out.println();
        }
    }

    public void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j=0;j<n-i;j++) System.out.print("*"+" ");
            System.out.println();
        }
    }

    public void pattern4(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++) System.out.print(j+1+" ");
            System.out.println();
        }
    }

    public void pattern5(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++) System.out.print("*"+" ");
            System.out.println();
        }
        for (int i = n; i < 2*n-1; i++) {
            for (int j=0;j<2*n-i-1;j++) System.out.print("*"+" ");
            System.out.println();
        }
    }

    public void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            for(int j=n;j<2*n-1;j++){
                if(j<n+i){
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n=s.nextInt();
        PatternQuestions p=new PatternQuestions();
        p.pattern1(n);
        System.out.println();
        p.pattern2(n);
        System.out.println();
        p.pattern3(n);
        System.out.println();
        p.pattern4(n);
        System.out.println();
        p.pattern5(n);
        System.out.println();
        p.pattern6(n);
        System.out.println();
        p.pattern7(n);
        System.out.println();
        p.pattern8(n);
    }
}
