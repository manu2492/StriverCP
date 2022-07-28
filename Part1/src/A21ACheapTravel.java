package src;
//https://codeforces.com/problemset/problem/466/A
import java.util.Scanner;

public class A21ACheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String n = word.split(" ")[0];
        int n1 = Integer.valueOf(n);
        
        String m = word.split(" ")[1];
        int m1 = Integer.valueOf(m);

        String a = word.split(" ")[2];
        int a1 = Integer.valueOf(a);

        String b = word.split(" ")[3];
        int b1 = Integer.valueOf(b);

        int countb = 0;
        int counta = 0;
        

        while(n1 > 0) {
            if (n1 > 1) {
                n1 -= m1;
                countb++;
            }
            else {
                n1 -= a1;
                counta++;
            }

        }

        int total = (countb * b1) + (counta * a1);
        System.out.println(total);


    }
    
}
