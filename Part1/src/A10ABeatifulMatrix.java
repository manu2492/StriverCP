package src;
import java.util.Scanner;

public class A10ABeatifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[5][5];

        int r = 0; 
        int c = 0;

        for (int i = 0; i < 5; i++) {
            matrix[i] = sc.nextLine().replace(" ", "").toCharArray();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 'R') {
                    r = i;
                    c = j;
                }
            }
        }
        int steps = Math.abs(r - 2) + Math.abs(c - 2);
        System.out.println(steps);
    }
    

    
}
