//package test;

import java.util.Scanner;
//import java.lang.Math;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// input amount of person
		int amount = 0;
		amount = scan.nextInt();
		scan.nextLine();
		// score of persons
		String str[] = new String[amount];
		for (int i = 0; i < amount; i++)
			str[i] = scan.nextLine();
		for (int i = 0; i < amount; i++) {
			// System.out.println(str);
			String strScore[] = str[i].split("\\s+");// any whitespaces
			printAverageScore(strScore);
		}
		// close
		scan.close();
	}

	public static void printAverageScore(String strScore[])
	{
		int count = 0; // the amount of scores
		int index = 0;
		// Scanner scan = new Scanner(System.in);
		int score[] = new int[4];
		for (String sTmp : strScore) {
			count++;
			score[index++] = Integer.parseInt(sTmp);
		}
		if (count == 3) {
			Student stu = new Student(score);
			stu.printName();
			System.out.print(stu.getAverageScore(score, 3) + "\n");
		}
		if (count == 4) {
			Teacher teach = new Teacher(score);
			teach.printName();
			System.out.print(teach.getAverageScore(score, 4) + "\n");

		}
	}
}

// person
class Person
{
	// private int score[3];
	// public Person(int a[])
	// {
	// // TODO Auto-generated constructor stub
	// }
	int getAverageScore(int score[], int length)
	{
		int total = 0;
		for (int i : score) {
			total += i;
		}
		return total / length;
	}

	void printName()
	{
		System.out.print(getClass().getSimpleName() + " ");
	}

}

// student
class Student extends Person
{
	private int score[] = new int[3];

	public Student(int score[])
	{
		for (int i = 0; i < 3; i++) {
			this.score[i] = score[i];
		}
		// public int getAverageScore() {
		// return Math.floor
	}

}

// teacher
class Teacher extends Person
{
	private int score[] = new int[4];

	public Teacher(int score[])
	{
		for (int i = 0; i < 4; i++) {
			this.score[i] = score[i];
		}
	}
}