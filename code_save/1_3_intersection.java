//package test;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		// BufferedReader readin = new BufferedReader(new
		// InputStreamReader(System.in));
		Scanner readin = new Scanner(System.in);
		int lengthOfArray1 = 0;
		int lengthOfArray2 = 0;
		int[] array1;
		int[] array2;

		try {
			//System.out.println("please input the length of array1:");
			lengthOfArray1 = readin.nextInt();
		} catch (Exception e) {
			// TODO: handle exception

		}
		array1 = new int[lengthOfArray1];
		try {
			for (int i = 0; i < lengthOfArray1; i++)
				array1[i] = readin.nextInt();
			lengthOfArray2 = readin.nextInt();
		} catch (Exception e) {
			// TODO: handle exception

		}

		array2 = new int[lengthOfArray2];
		try {
			for (int i = 0; i < lengthOfArray2; i++)
				array2[i] = readin.nextInt();
		} catch (Exception e) {
			// TODO: handle exception

		}

		// intersection handle
		int lengthOfIntersection = 0;
		for (int i = 0; i < lengthOfArray1; i++) {
			for (int j = 0; j < lengthOfArray2; j++) {
				if (array1[i] == array2[j]) {
					lengthOfIntersection++;
					break;
				}
			}
		}
		System.out.println(lengthOfIntersection);
		readin.close();
	}
}