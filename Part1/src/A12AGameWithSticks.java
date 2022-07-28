package src;
import java.util.*;

public class A12AGameWithSticks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String r = a.split(" ")[0];
        String c = a.split(" ")[1];

        int r2 = Integer.parseInt(r);
        int c2 = Integer.parseInt(c);

        if (r2 * c2 % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }

    }
    
}