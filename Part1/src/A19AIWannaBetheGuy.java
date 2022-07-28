package src;
import java.util.Arrays;
import java.util.Scanner;
public class A19AIWannaBetheGuy
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] x1=new int[x];

		for(int i=0; i<x; i++)
			x1[i] = sc.nextInt();

		int y = sc.nextInt();
		int[] y1 = new int[y];
		for(int i=0; i<y; i++)
			y1[i] = sc.nextInt();

		int p = 0,q = 0;

		for(int j=1; j<=n; j++){
			if(Arrays.toString(x1).contains(String.valueOf(j))){
				p++;
				continue;
			}
			if(Arrays.toString(y1).contains(String.valueOf(j))){
				q++;
				continue;
			}
		}

		if(n==p+q)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
	}
}

