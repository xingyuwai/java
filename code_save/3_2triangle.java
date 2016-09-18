//package test;

import java.lang.Math;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double side[] = {0.0d, 0.0d, 0.0d};
		//System.out.println("hello");
		
		try {
			for (int i = 0; i < 3; i++) 
				side[i] = scan.nextDouble();
		} catch (Exception e) {
			// nothing to do
		}
		Triangle tri = new Triangle(side);
		System.out.println(tri.getArea());
		
		//triangle
			
			scan.close();		
		
	}
}

class Triangle
{
	private double side[] = new double[3];

	public Triangle(double side[])
	{
		int  max = 0;
		max = side[0] < side[1]	? 1 : 0;
		max = side[max] < side[2] ? 2 : max;
		for (int i = 0; i < 3; i++)
			this.side[i] = side[i];
		if (side[max] <= 0)
			for (int i = 0; i < 3; i++)
				this.side[i] = 0;
		else if (side[max] >= side[0] + side[2] +side[1] -side[max])
			for (int i = 0; i < 3; i++)
				this.side[i] = side[max];
	}

	public double getArea()
	{
		double p = (side[0] + side[1] + side[2]) / 2;
		return Math.sqrt(p * (p - side[0]) * (p - side[1]) * (p - side[2]));
	}
}