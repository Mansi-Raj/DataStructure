package Search;
import java.util.*;

public class QuestionId367 {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        for (double i = 1; i <= num / i; i++) {
            if (num / i == i) {
                return true;
            }
        }
        return false;
    }

    public static <QuestionId1367> void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
        QuestionId367 q=new QuestionId367();
        System.out.print(q.isPerfectSquare(n));
        s.close();
    }
}
