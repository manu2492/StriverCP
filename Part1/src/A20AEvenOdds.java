package src;
/*https://codeforces.com/problemset/problem/318/A */
import java.util.ArrayList;
import java.util.Scanner;

public class A20AEvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList arr = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            if (i % 2 != 0 && i != 0) {
                arr.add(i);
            }
        }
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0 && i != 0) {
                arr.add(i);
            }
        }
       
        System.out.println(arr.get(k - 1));
       
    }
    
}
