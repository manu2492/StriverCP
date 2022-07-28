package src;
/*
Input
WUBWUBABCWUB

Output
ABC 
*/
import java.util.Scanner;

public class A14ADubstep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String originalWord = sc.nextLine();

        String word1 = originalWord.replaceAll("WUB", " ");
        System.out.println(word1);
    }
}