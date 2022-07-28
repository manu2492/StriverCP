package src;
import java.util.*;
    
public class A25ADreamoonandStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = Integer.valueOf(a.split(" ")[0]);
        int m = Integer.valueOf(a.split(" ")[1]);
        int x = 0;
        
        if (m > n) {
            x = -1;
        }
        else {
            if (n % 2 == 0) {
                x = n/2;
            }
            else {
                x = (n / 2) + 1;
            }
            while(x % m != 0) {
                x++;
            }
        }
        System.out.println(x);
    }
}