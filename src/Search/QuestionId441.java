package Search;
import java.util.*;

public class QuestionId441 {
    public int arrangeCoins(int n) {
        int i=1;
        int count=0;
        while(n>=i){
            n-=i;
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
        QuestionId441 q=new QuestionId441();
        System.out.print(q.arrangeCoins(n));
        s.close();
    }
}
