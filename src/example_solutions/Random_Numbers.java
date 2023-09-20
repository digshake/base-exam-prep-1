/**
 * CSE 131 Exam 1 Practice Problems
 */
package example_solutions;

import java.util.Scanner;

public class Random_Numbers {
	public static void main(String[] args) {
		// --------------------Setup--------------------
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int quantity = in.nextInt();
		// TODO: Extra Practice: If the user provided a number <= 0,
		// continue asking them to provide a valid number until they do 
		while (quantity < 1)
		{
			System.out.println("PLEASE ener a positive number");
			quantity = in.nextInt();
		}
		System.out.println("Enter a number between 1 and 100 (inclusive):");
		int threshold = in.nextInt();
		/*
		 * 
		 * TODO: Extra practice: Add code to check whether the user entered 
		 * a number between 1 and 100 (inclusive). Continue to ask them to 
		 * enter a valid number until their number is between 1 and 100. 
		 */
		while (threshold < 1 || threshold > 100)
		{
			System.out.println("Your number wasn't between 1 and 100. Please enter "
					+ "a valid number");
			threshold = in.nextInt();
		}
		in.close();
		/*
		 * TODO: Your work!
		 * 1) Make an array of integers with size quantity. 
		 * 2) Fill the array with quantity random numbers between 0 
		 * and 100 (inclusive). 
		 * 3) Count the number of entries in the array that have a 
		 * value above threshold. 
		 */
		int [] array = new int[quantity];
		int above = 0;
		for (int i = 0; i < quantity; i++)
		{
			array[i] = (int)(Math.random() * 100 + 1);
			if (array[i] > threshold)
			{
				above++;
				System.out.println(array[i]);
			}
		}
		System.out.println(above);
	}

}
