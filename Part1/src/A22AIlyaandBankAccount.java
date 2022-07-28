package src;
//https://codeforces.com/problemset/problem/313/A
import java.util.Scanner;

public class A22AIlyaandBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String output;

        if (Integer.valueOf(n) > 0) {
            output = n;

        }

        else if (Integer.valueOf(n) < 0) {
            
            char last = n.charAt(n.length() - 1);
            char secondLast = n.charAt(n.length() - 2);

            int lastInt = Integer.valueOf(last);
            int secondLastInt = Integer.valueOf(secondLast);

            

            if (lastInt > secondLastInt) {
                n = n.substring(0, n.length()-1);
                
                if (Integer.valueOf(n) == 0) {
                    n = "0";
                }
            }
            else {
                n = n.substring(0, n.length()-2) + n.substring(n.length()-1, n.length());
                if (Integer.valueOf(n) == 0) {
                    n = "0";
                }
                
            }

            output = n;
        }

        else {
            output = "0";
        }

        
        System.out.println(output);
        

        

    }
}
        