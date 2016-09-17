import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int height = 0, width = 0;
		Rectangle rec = new Rectangle();
		Scanner scan = new Scanner(System.in);
		try {
			height = scan.nextInt();
			width = scan.nextInt();
		} catch (Exception e) {
			//
		}
		System.out.println(rec.getArea(height, width) + " "+ rec.getPerimeter(height, width));
		scan.close();
	}
}

// auxiliary class
class Rectangle
{
	int height, width;

	int getPerimeter(int height, int width)
	{
		return 2 * (height + width);
	}

	int getArea(int height, int width)
	{
		return height * width;
	}
}