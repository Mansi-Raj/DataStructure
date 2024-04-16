package PatternQuestions;
import java.util.*;

public class PatternQuestion6 {
    public void pattern28(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) System.out.print("*"+" ");
            System.out.println();
        }
        for(int i=n;i<2*n-1;i++){
            for(int j=0;j<i-n+2;j++) System.out.print(" ");
            for(int j=0;j<2*n-1-i;j++) System.out.print("*"+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=s.nextInt();
        PatternQuestion6 p=new PatternQuestion6();
        p.pattern28(n);
    }
}
