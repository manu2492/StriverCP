package src;
import java.util.Scanner;

public class A18AAntonandLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String word2 = word.replaceAll("[ ,{}]", "");
        String word3 = "";

        for (int i = 0; i < word2.length(); i++) {
            if (word3.contains(word2.substring(i, i + 1))) {
                continue;
            }
            else {
                word3 += word2.charAt(i);
            }
            
        }
       
        System.out.println(word3.length());
    }
}
