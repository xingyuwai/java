//package test;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int fib;
		// System.out.println("please input the order of fibnacci:");
		try {
			fib = scan.nextInt();
		} catch (Exception e) {
			scan.next();
			// System.out.println("Please input a integer");
			fib = scan.nextInt();
		}

		// calculate fibnacci
		long prev = 1;
		long prev2 = 1;
		long fibnacci = 1;
		for (int i = 2; i <= fib; i++) {
			fibnacci = prev + prev2;
			prev2 = prev;
			prev = fibnacci;
		}
		//out
		System.out.println(fibnacci);
		scan.close();

	}
}