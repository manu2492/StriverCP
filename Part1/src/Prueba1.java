package src;

import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '1') {
                count1++;
            }
            else if (word.charAt(i) == '2') {
                count2++;
            }
            else if (word.charAt(i) == '3') {
                count3++;
            }
            
        }
        String word2 = "";
        for (int i = 0; i < count1; i++) {
            word2 += "1+";
        }
        for (int i = 0; i < count2; i++) {
            word2 += "2+";
        }
        for (int i = 0; i < count3; i++) {
            word2 += "3+";
        }
        //way 1
        word2 = word2.substring(0, word2.length()-1);
        
        //way 2
        StringBuffer sb = new StringBuffer(word2);
        sb = sb.deleteCharAt(word2.length()-1);

        System.out.println(word2);
        System.out.println(sb);
    }

        
    
}
