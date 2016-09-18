import java.lang.String;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String[] str;
		int amount = 0;
		Scanner scan = new Scanner(System.in);
		try {
			amount = scan.nextInt();
		} catch (Exception e) {
			// to do
		}
		str = new String[amount];
		for (int i = 0; i < amount; i++) {
			str[i] =scan.next();
		}
		
		// bubble sort
		for (int i =0; i < amount; i++)
			for (int j=0; j < amount - i - 1; j++) {
				String tmp;
				int cmp = 0;
				cmp = str[j].compareToIgnoreCase(str[j + 1]);
				if (cmp > 0)
				{
					tmp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = tmp;
				}
			}
		for (int i = 0; i < amount; i++) {
			System.out.println(str[i]);
		}
		scan.close();
	}
}
