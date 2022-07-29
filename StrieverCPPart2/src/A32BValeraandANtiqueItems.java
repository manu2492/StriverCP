//https://codeforces.com/problemset/problem/441/A
import java.util.Scanner;

public class A32BValeraandANtiqueItems {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sellers = sc.nextInt(), m = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        int count = 0;

        for (int i = 0; i < sellers; i++) {
            int itemsNumber = sc.nextInt();
            for (int j = 0; j < itemsNumber; j++) {
                int itemValue = sc.nextInt();
                if (itemValue < m) {
                    count++;
                    answer.append(i + 1).append(" ");
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(answer);
    }
}
