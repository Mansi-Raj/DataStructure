package Arrays;
import java.util.*;
public class SpiralMatrixII {
    public int[][] generateMatrix(int n){
        int[][] matrix=new int[n][n];
        int count=1;
        int i=0;
        int j=0;
        while(i<n&&j<n){
            for(int k=i;k<n;k++){
                matrix[i][k]=count;
                count++;
            }
            i++;
            for(int k=i;k<n;k++){
                matrix[k][n-1]=count;
                count++;
            }
            n--;
            if(i<n){
                for(int k=n-1;k>j;k--){
                    matrix[n][k]=count;
                    count++;
                }
            }
            if(j<n){
                for(int k=n;k>=i;k--){
                    matrix[k][j]=count;
                    count++;
                }
            }
            j++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = s.nextInt();
        System.out.print("Enter the elements of matrix: ");
        SpiralMatrixII sm=new SpiralMatrixII();
        int[][] matrix=sm.generateMatrix(n);
        System.out.print(Arrays.deepToString(matrix));
        s.close();
    }
}
