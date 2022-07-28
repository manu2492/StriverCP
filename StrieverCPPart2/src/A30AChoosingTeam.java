//https://codeforces.com/problemset/problem/432/A
import java.util.Scanner;

public class A30AChoosingTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + k <= 5) {
                count++;
            }
        }
        System.out.println(count / 3);
    }
}