package example_solutions;

import java.util.Scanner;

public class TwoDimBool {
	public static void main(String[] args)
	{
		// --------------------Setup--------------------
		Scanner in = new Scanner(System.in);
		System.out.println("How many rows and columns?");
		int N = in.nextInt();
		in.close();
		// Create two-dimensional array of booleans, with N rows and N columns
		boolean[][] A = new boolean[N][N];
		int numTrue = 0; // Number of entries in A that are true
		
		 /* --------------------Your Work--------------------
		 TODO: Loop through every entry in A and randomly determine whether 
		 the entry will be true or false. Ensure numTrue represents the number
		 of elements in A that are true. 
		 Hint: use Math.random() */
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[0].length; j++)
			{
				A[i][j] = (Math.random() < .5);
				if (A[i][j])
				{
					numTrue++; 
				}
			}
		}
		// Printing the array and numTrue to prove it worked
		System.out.println("Array: ");
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[0].length; j++)
			{
				System.out.print(A[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("numTrue is: " + numTrue);
	}
}
