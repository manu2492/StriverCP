package src;
import java.util.Scanner;

public class A8ALuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count2 = 0;
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == '4' || word.charAt(i) == '7') {
                count++;
                //continue;
            }
            

            if (word.length() == count) {
                System.out.println("YES");
            }
        }
        
        if (word.length() != count) {
            int word2 = Integer.parseInt(word);
            

            if (word2 % 7 == 0 || word2 % 4 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
    

