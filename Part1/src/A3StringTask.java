package src;
import java.util.Scanner;


public class A3StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if (word.length() < 101) {
            word = word.toLowerCase();
            word = word.replaceAll("[aeiou]", "");
            StringBuilder sb = new StringBuilder(word);

            for (int i = 0; i < sb.length(); i+=2) {
                sb.insert(i, ".");
            }
            System.out.println(sb);
        }

        else {
            System.out.println("Too long");
        }
    }
    
}
