package For_Loop_Exploration;

public class TransposeArray {
	public static void main(String[] args)
	{
		// Just know that line 7 makes an array with a random number of columns
		// and rows and stores it in getTransposed
		int [][] getTransposed = makeArray();
		// TODO: make a new array, with the same number of columns as getTransposed
		// has rows (and as many rows as getTransposed has columns). Then, for a 
		// given item at row r and column c in getTransposed, put the same item in
		// row c and column r in your new array
		
	}
	
	// Make an array of random size and random elements. 
	// Ignore this code for now--you won't learn the specifics of how this 
	// works until module 5. 
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
