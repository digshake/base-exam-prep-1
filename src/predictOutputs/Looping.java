package predictOutputs;

public class Looping {
	public static void main(String[] args)
	{
		/*
		 * Get out a piece of paper! Predict the output for each question
		 * and write down your answers. Then run your code. Did it match what
		 * you expected? If so, explain why. Otherwise, figure out 
		 * why it differed from your expectations and explain your
		 * thought process thoroughly. Check your work with a TA.
		 */
		System.out.println("Question 1: ");
		for(int i = 3; i < 7; i+=2)
		{
			System.out.println(i);
		}
		
		System.out.print("\nQuestion 2: \n");
		for(int i = 0; i < 3; i++)
		{
			int j = i * 2;
			while (j % 3 != 0)
			{
				System.out.println(j);
				j++;
			}
			System.out.println(i);
		}
		
		System.out.print("\nQuestion 3: \n");
		int j = 1; 
		for (int i = 0; i < 7; i++)
		{
			if(i + j > 3)
			{
				System.out.println(i + j);
				j=1;
			}
			else
			{
				j+=2;
			}
		}
		
		System.out.print("\nQuestion 4: \n");
		int i = 1; 
		j = 2;
		while (i * j <= i + 9)
		{
			System.out.println(i + j);
			j = i;
			i++;
		}
		
		System.out.print("\nQuestion 5: \n");
		for(int k = 0; k < 3; ++k)
		{
			for(int m = 0; m <= k; ++m)
			{
				System.out.println(k + "." + m);
			}
		}
		
		System.out.print("\nQuestion 6: \n");
		for(int n = 0; n < 3; n++)
		{
			for(int o = 4; o > 2; o--)
			{
				System.out.println("n:" + n + " o:" + o);
			}
		}
		
	}
}
