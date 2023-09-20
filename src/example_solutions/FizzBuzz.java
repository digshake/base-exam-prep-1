package example_solutions;

import java.util.Scanner;

public class FizzBuzz {
	public static void main (String[] args)
	{
		
		/*
		 * Example FizzBuzz Solution (TA eyes only!)
		 */
		// Asking the user for their number
		Scanner in = new Scanner(System.in);
		System.out.println("Give me any whole number above 1: ");
		int max = in.nextInt();
		// Checking for valid input
		while (max < 2)
		{
			System.out.println("Please provide a whole number above 1: ");
			max=in.nextInt();
		}
		System.out.println("FizzBuzz Results for numbers 1 through " + max + ":\n");
		
		// Looping through the numbers less than max 
		for(int i = max; i > 0; i--)
		{
			// Put the most specific condition first, the most general last
			// Emphasize practicing compound conditions and modulus
			if(i % 5 == 0 && i % 3 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if (i % 5 == 0)
			{
				System.out.println("Fizz");
			}
			else if (i % 3 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
		in.close(); // Good practice
	}
	
}
