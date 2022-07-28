package src;
import java.util.Scanner;

public class A11AArrivaloftheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int min1 = 10000;
        int max1 = 0;

        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
                indexMin = i;
                //System.out.println(indexMin);
            }
            else if (arr[i] == min1) {
                indexMin = i + 1;
                //System.out.println(indexMin);
            }
            if (arr[i] > max1) {
                max1 = arr[i];
                indexMax = i;
                //System.out.println(indexMax);
            }
            else if (arr[i] == max1) {
                indexMax = i + 1;
                //System.out.println(indexMin);
            }
                
        }
            
    
        
        int stepsMin = arr.length - indexMin;
        int stepsMax = indexMax;

        int stepsNumber = (stepsMin + stepsMax) - 1
        ;
        System.out.println(stepsNumber);

    }
    
}
