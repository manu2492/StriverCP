package src;
import java.util.Scanner;


public class A3BStringTask {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (isVowel(c))
				continue;
			else if (Character.isUpperCase(word.charAt(i)))
				stringBuilder.append(".").append(Character.toLowerCase(word.charAt(i)));
			else
				stringBuilder.append(".").append(word.charAt(i));
		}
		System.out.println(stringBuilder.toString());

		in.close();

	}

	public static boolean isVowel(char c) {
		String s = "AOYEUIaoyeui";
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				return true;
		return false;
	}
    
}
