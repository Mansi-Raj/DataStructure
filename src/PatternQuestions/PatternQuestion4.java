package PatternQuestions;
import java.util.*;

public class PatternQuestion4 {
    public void pattern18(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<2*n;j++){
                if(j<n+i){
                    System.out.print(" "+" ");
                }else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
        for (int i=n;i<2*n;i++){
            for(int j=0;j<n;j++){
                if(j<=i-n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<2*n;j++){
                if(j>=3*n-i-1){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern19(int n){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(j<=i){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<2*n;j++){
                if(j<2*n-i-1){
                    System.out.print(" "+" ");
                }else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }

        for(int i=n;i<2*n-1;i++){
            for(int j=0;j<n;j++){
                if(j<2*n-i-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            for(int j=n;j<2*n;j++){
                if(j<=i){
                    System.out.print(" "+" ");
                }else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern20(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(i==0||j==0||i==n-1||j==n-2){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern21(int n){
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    public void pattern22(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               if(i%2==0&&j%2==0||i%2!=0&&j%2!=0){
                   System.out.print(1+" ");
               }else{
                   System.out.print(0+" ");
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
        System.out.println();
        p.pattern19(n);
        System.out.println();
        p.pattern20(n);
        System.out.println();
        p.pattern21(n);
        System.out.println();
        p.pattern22(n);
    }
}
