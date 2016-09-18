package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int brickN = 0;
		brickN = scan.nextInt();
		System.out.println(method(brickN));
		scan.close();
	}
	public static long  method(int brickN) {
		long stepPre = 1, stepPre2 = 1;
		long  way = brickN == 0 ? 0 : 1;
		for (int i = 2; i <= brickN; i++) {
			way = stepPre + stepPre2;
			stepPre2 = stepPre;
			stepPre = way;
			
		}
		return way;
	}
}