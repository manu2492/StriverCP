package src;
import java.util.Scanner;

public class A6BChatRoom {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String hello = "hello";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (count == hello.length())
                break;
            else if (word.charAt(i) == hello.charAt(count))
                count++;
        }
        if (count >= hello.length()) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    
}
