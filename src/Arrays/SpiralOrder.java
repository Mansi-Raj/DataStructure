package Arrays;
import java.util.*;
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][]matrix){
        List<Integer> order = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        while(i<m&&j<n){
            for(int k=i;k<n;k++)order.add(matrix[i][k]);
            i++;

            for(int k=i;k<m;k++)order.add(matrix[k][n-1]);
            n--;

            if(i<m){
                for(int k=n-1;k>j;k--) order.add(matrix[m-1][k]);
            }
            m--;
            if(j<n){
                for (int k=m;k>=i;k--)order.add(matrix[k][j]);
            }
            j++;
        }
        return order;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row=s.nextInt();
        System.out.print("Enter the no of columns: ");
        int col=s.nextInt();
        System.out.print("Enter the elements of matrix: ");
        int[][] matrix=new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        SpiralOrder so=new SpiralOrder();
        List<Integer>result=so.spiralOrder(matrix);
        System.out.print("Spiral order of matrix: "+result);
        s.close();
    }
}
