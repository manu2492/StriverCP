//https://codeforces.com/problemset/problem/439/A
import java.util.*;
public  class A27ADevutheSingerandChurutheJoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        int n = Integer.valueOf(a.split(" ")[0]);
        int d = Integer.valueOf(a.split(" ")[1]);

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(b.split(" ")[i]);
        }
        
        int minutes = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            minutes += arr[i];
            if (minutes + 5 != d) {
                minutes += 10;
                count += 2;
            }
            else {
                minutes += 5;
                count++;
            }
            
            
        }
        while (minutes < d) {
            minutes += 5;
            count ++;
        }
        if (minutes == d) {
            System.out.println(count);
        }
        else {
            System.out.println("-1");
        }
    }
}


    
