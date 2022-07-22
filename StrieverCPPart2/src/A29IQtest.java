//https://codeforces.com/problemset/problem/25/A
import java.util.*;
public class A29IQtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
                if (evenCount == 2) {
                    break;
                }
            }
            else {
                oddCount++;
                if (oddCount == 2) {
                    break;
                }
            }
        }
        int index = 0;
        if (evenCount > oddCount) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    index = i + 1;
                    break;
                }
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    index = i + 1;
                    break;
                }
            }
        }
        System.out.println(index);
    }
}
