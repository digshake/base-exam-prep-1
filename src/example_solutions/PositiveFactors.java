package example_solutions;

import java.util.Scanner;

public class PositiveFactors {
	public static void main(String[] args)
	{
		// Setup
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		int n = in.nextInt();
		// Bonus: add code to continue asking the user for proper input
		// if they don't provide a positive integer. 
		while (n < 1)
		{
			System.out.println("Please enter a valid, positive integer");
			n = in.nextInt();
		}
		in.close();
		// TODO: Print the number of positive factors for the number
		// that the user entered. For example, if the user entered 8,
		// print 4 (1, 2, 4, and 8 are factors of 8). 
		for (int i = 1; i < n / 2; i++)
		{
			if (n % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}