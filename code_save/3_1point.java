//package test;

import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Scanner;


class MyPoint
{
	private double x, y;

	public MyPoint() {
		x = 0.0d;
		y = 0.0d;
	}

	public MyPoint(double x, double y ) {
		this.x = x;
		this.y = y;
	}
	
	double getD(MyPoint point) {
		return Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y - point.y,2));
	}
}
// test
public class Main {
public static void main(String[] args)
	{
		double x1 = 0.0d, y1 = 0.0d;
		double x2 = 0.0d, y2 = 0.0d;
		Scanner scan = new Scanner(System.in);
		try {
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		MyPoint point1 = new MyPoint(x1, y1);
		MyPoint point2 = new MyPoint(x2, y2);
		System.out.println(point1.getD(point2));
		scan.close();
	}
}
