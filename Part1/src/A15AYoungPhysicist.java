package src;
/**
 * 
 * Input
3
4 1 7
-2 4 -1
1 -5 -3

Output
NO

Input
3
3 -1 7
-5 2 -4
2 -1 -3

Output
YES

if the sum of the items is equal to 0 print YES, else print NO
 */
import java.util.Scanner;

public class A15AYoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] obj = new int[n][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                obj[i][j] = sc.nextInt();
            }
        }
        int x = 0;
        int y = 0; 
        int z = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x += obj[i][0];
                y += obj[i][1];
                z += obj[i][2];
            }
        }

        if (x == 0 && y == x && z == y) {
            System.out.println("YES");
        } 
        else {
            System.out.println("NO");
        }
    }
}
