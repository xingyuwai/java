package test;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1 = 2;
		int num2 = 2;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.printf("%d %d%n", gcd(num1, num2), lcm(num1, num2) );
	}
	
	public static int gcd(int num1, int num2) {
		return (num2 == 0) ? num1 : gcd(num2, num1 % num2);
		
	}
	
	public static int lcm(int num1, int num2) {
		return  num1 * num2 / gcd(num1, num2);
	}
}