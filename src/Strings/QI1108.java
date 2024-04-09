package Strings;
import java.util.*;

public class QI1108 {
    public String defangIPaddr(String address) {
        String newAddress=address.replace(".", "[.]");
        return newAddress;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=s.next();
        QI1108 q=new QI1108();
        System.out.println(q.defangIPaddr(str));
        s.close();
    }
}
