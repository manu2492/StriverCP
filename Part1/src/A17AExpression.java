package src;
import java.util.*;
public class A17AExpression {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        int a=z.nextInt();
        int b=z.nextInt();
        int c=z.nextInt();

        if(a==1 && b==1 && c==1)
            System.out.println(3);

        else if((a==1 && b==1) || (b==1 && c==1) || (c==1 && a==1)){
            if(c==1 && a==1)
                System.out.println(a+b+c);
            else if(a==1 && b==1)
                System.out.println((a+b)*c);
            else
                System.out.println(a*(b+c));
        }

        else if(a==1 || b==1 || c==1){
            int d=Math.min(a, b);
            if(d==1){
                if(((a+b)*c)>=(a*(b+c)))
                    System.out.println((a+b)*c);
                else
                    System.out.println(a*(b+c));
            }
            else{
                if(((a+b)*c)>=(a*(b+c)))
                    System.out.println((a+b)*c);
                else
                    System.out.println(a*(b+c));
            }
        }
        
        else
            System.out.println(a*b*c);
    }
}