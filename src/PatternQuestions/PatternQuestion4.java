package PatternQuestions;
import java.util.*;

public class PatternQuestion4 {
    public void pattern18(int n){
        for (int i=0;i<n;i++){
            for(int j=n-i;j>0;j--) System.out.print("*"+" ");

            for(int j=n;j<2*n-1;j++){
                if(j>=n+i){
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
        PatternQuestion4 p=new PatternQuestion4();
        p.pattern18(n);
    }
}
