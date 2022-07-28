package src;
//https://codeforces.com/problemset/problem/230/A
import java.util.*;
public class A24ADragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int s = Integer.valueOf(a.split(" ")[0]);
        int n = Integer.valueOf(a.split(" ")[1]);
        
        
        int[] arr = new int[n*2];
        for (int i = 0; i < n; i+=2) {
            arr[i] = Integer.valueOf(sc.nextLine().split(" ")[0]);
            arr[i+1] = Integer.valueOf(sc.nextLine().split(" ")[1]);
        }

        int count = 0;
        boolean flag = true;

        while (flag) {
            for (int i = 0; i < arr.length; i+=2) {
                if (s > arr[i]) {
                     s += arr[i+1];
                     arr[i] = 1000000;
                     count++;
                }
                
            } 
            if (count == n) {
                flag = false;
                System.out.println("yes");
            }
            else {
                flag = false;
                System.out.println("no");
            }
        }
    }
        
}
    

    

