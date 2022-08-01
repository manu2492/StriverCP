//better solution for all days what ever you want to do
//https://codeforces.com/problemset/problem/385/A
import java.util.Scanner;

public class A34ABearandRaspberry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
                else if (arr[i] > arr[j]) {
                    profit = (arr[i] - arr[j]) - ((j - i) * c);
                    
                    if (profit > maxProfit) {
                        System.out.println(arr[i]);
                        System.out.println(arr[j]);
                        System.out.println("------");
                        maxProfit = profit;
                    }
                }
                
            }
        }
        System.out.println(maxProfit);

    }
}
