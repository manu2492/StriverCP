package Part2.src;

import java.util.*;

public class Serpent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int n = Integer.valueOf(a.split(" ")[0]);
        int m = Integer.valueOf(a.split(" ")[1]);
        int count = n;
        
        String string1 = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";

        for (int i = 0; i < m; i++) {
            string1 += "#";
            string2 += "."; 
            string3 += "#";
            string4 += ".";
        }
        string2 = string2.substring(0, m-1) + "#";
        string4 = "#" + string4.substring(1, m);
        
        

        while(count > 4) {
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);
            System.out.println(string4);
            count -= 4;
        }
        if(count == 4) {
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);
            System.out.println(string4);
        }
        else if (count == 3) {
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);
        }
        else if (count == 2) {
            System.out.println(string1);
            System.out.println(string2);
        }
        else if (count == 1) {
            System.out.println(string1);
        }
    }
}
