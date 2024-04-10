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
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
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
    }
}
