//package test;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = 6;
		number = scan.nextInt();
		for (int i = 3; i < number / 2; i += 2)
			if (isPrime(i) && isPrime(number - i))
				System.out.printf("%d=%d+%d%n", number, i, number - i);

		// close
		scan.close();
	}

	// prime or not
	public static boolean isPrime(int num)
	{
		boolean result = true;
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				result = false;
		}
		return result;
	}
}