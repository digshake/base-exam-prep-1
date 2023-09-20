package example_solutions;

import java.util.Scanner;

public class Sequence {
	public static void main(String[] args)
	{
		// Setup
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int n = in.nextInt();
		while (n < 1)
		{
			System.out.println("Give me a positive number this time: ");
			n = in.nextInt();
		}
		in.close();
		// TODO: Implement the following formula using n: 
		// 1 - (1/2) + (1/3) - (1/4) ... (1/n)
		double answer = 1; 
		for (int i = 2; i <= n; i++)
		{
			// If i is even, subtract 1/i. If not, add 1/i
			answer += (i % 2 == 0) ? (-1.0/(double)(i)) : (1.0 / (double)(i));
		}
		System.out.println(answer);
	}
}
