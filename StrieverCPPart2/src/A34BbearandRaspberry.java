//https://codeforces.com/problemset/problem/385/A
import java.util.Scanner;

public class A34BbearandRaspberry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProfit = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            
            int profit = 0;
            if (arr[i] < arr[i+1]) {
                continue;
            }
            else if (arr[i] > arr[i+1]) {
                
                profit = (arr[i] - arr[i+1]) - ((i+1 - i) * c);
                if (profit > maxProfit) {
                    
                    maxProfit = profit;
                }
            }
        }
        
        System.out.println(maxProfit);

    }
}