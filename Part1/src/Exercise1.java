package src;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int n = 2;
        miSegunda(n);

        
    }
    public static int miSegunda(int n){
        if (n == 0) {
            System.out.println(1);
        }
        else {
            int s = n * miSegunda(n - 1);
            System.out.println(s);
        }
        return n;

    }
}
