import java.util.Scanner;
import java.util.TreeSet;
import java.util.SortedSet;

public class A32AValeraandAntiqueItems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int sellers = in.nextInt(), m = in.nextInt();
		StringBuilder ans = new StringBuilder();
		SortedSet <Integer> deal = new TreeSet<>();
		for (int i = 0; i < sellers; i++) {
			int items = in.nextInt();
			for (int j = 0; j < items; j++) {
				int itemValue = in.nextInt();
				if (itemValue < m)
					deal.add(i + 1);
			}
		}
		ans.append(deal.size()).append("\n");
		for (Integer s : deal)
			ans.append(s).append(" ");
		ans.deleteCharAt(ans.length() - 1);
		System.out.println(ans.toString());
		in.close();
        
    }
}
