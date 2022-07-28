package src;
import java.util.*;
public class A16BPuzzles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pieces = new int[m];

        for (int i = 0; i < m; i++)
            pieces[i] = sc.nextInt();

        Arrays.sort(pieces);
        
        run2(n,m,pieces);
        
    }
    
    static void run2(int n, int m, int[]pieces) {
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for(int i = 0; i < m - n + 1; i++) {
            min = Math.min(min, pieces[i+n-1] - pieces[i]);
        }
        System.out.println(min);
    }

    
}
