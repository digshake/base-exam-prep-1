package example_solutions;

public class TransposeArray {
	public static void main(String[] args)
	{
		int [][] getTransposed = makeArray();
		// TODO: make a new array, which is getTransposed transposed. 
		// Make an array whose height is the old array's width and width is the old array's height
		int [][] transposed = new int[getTransposed[0].length][getTransposed.length];
		
		// Printing the original array at the same time as filling the new array for efficiency
		System.out.println("Orgiginal Array: ");
		for (int r = 0; r < getTransposed.length; r++)
		{
			for(int c = 0; c < getTransposed[0].length; c++)
			{
				transposed[c][r] = getTransposed[r][c]; // Switch row and column 
				System.out.print(getTransposed[r][c] + "\t"); // \t is tab, helps printing look less ugly
			}
			System.out.println();
		}
		System.out.println("Transposed Array:");
		for(int r = 0; r < transposed.length; r++)
		{
			for (int c = 0; c < transposed[0].length; c++)
			{
				System.out.print(transposed[r][c] + "\t");
			}
			System.out.println();
		}
		
	}
	
	// Make an array of random size and random elements. 
	public static int[][] makeArray()
	{
		int r = (int)(Math.random() * 10 + 1);
		int c = (int)(Math.random() * 10 + 1);
		int [][] result = new int[r][c];
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				result[i][j] = (int)(Math.random() * 100 + 1);
			}
		}
		return result;
	}
}
