package src;

import java.util.Scanner;


public class A2WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int count = s.length() - 2;
            String word = "";
            word += s.charAt(0);
            word += count;
            word += s.charAt(s.length() - 1);

            result[i] = word;

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

    

