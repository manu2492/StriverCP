//https://codeforces.com/problemset/problem/276/A
import java.util.Scanner;

public class A35ALunchRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n*2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxJoy = 0;

        for (int i = 0; i < arr.length; i+=2) {
            int value = 0;
            if (arr[i+1] > k) {
                value = arr[i] - (arr[i+1] - k);
            }
            else {
                value = arr[i];
            }
    
            if (value > maxJoy) {
                maxJoy = value;
            }
    
        }
        
        System.out.println(maxJoy);
    }
    
}
