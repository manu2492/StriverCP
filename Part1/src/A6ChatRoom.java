package src;
import java.util.Scanner;

public class A6ChatRoom {
    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String hello = "hello";
		int k = 0;

		for (int i = 0; i < S.length(); i++) {
			if (k == hello.length())
				break;
			if (S.charAt(i) == hello.charAt(k))
				k++;
		}
		
		if (k >= hello.length())
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();

	}
    
}
