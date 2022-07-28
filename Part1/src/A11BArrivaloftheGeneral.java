package src;
import java.util.*;
public class A11BArrivaloftheGeneral{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int temp = 0;
		int ctr = 0;
		
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);

		for(int i = findLast(b[0], a); i < n-1; i++)
		{
			if(a[i] < a[i+1])
			{
				temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
				ctr++;
			}
		}
		
		for(int i = findFirst(b[n-1], a); i > 0; i--)
		{
			if(a[i] > a[i-1])
			{
				temp = a[i-1];
				a[i-1] = a[i];
				a[i] = temp;
				ctr++;
			}
		}
		
		
		
		System.out.println(ctr);
		
		
	}
	
	static int findFirst(int x, int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
	static int findLast(int x, int[] a)
	{
		for(int i = a.length-1; i >= 0; i--)
		{
			if(a[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
}