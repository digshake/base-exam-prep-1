package example_solutions;

import java.util.Scanner;

public class Password {
	public static void main(String[] args)
	{
		// Example Solution for Password (TA eyes only!)
		Scanner in = new Scanner(System.in);
		char[] validCharacters = genCharacters();
		System.out.println("How long would you like your password to be?");
		int length = in.nextInt();
		String result = "";
		System.out.println("Please provide your first and last name (separated by a space):");
		String firstName = in.next();
		String lastName = in.next();
		int consecutiveDigits = 0;
		int consecutiveLetters = 0;
		for(int i = 0; i < length; i++)
		{
			char random = validCharacters[(int)(Math.random()*72)];
			// ASCII Table method, can also just directly check if the char is equal
			// to '0', '1', etc
			if ((int)(random) > 47 && (int)(random) < 58)
			{
				consecutiveDigits++;
			}
			else
			{
				consecutiveDigits = 0;
			}
			// Checking for consecutive characters 
			if(i > 0 && result.charAt(i-1) == random)
			{
				consecutiveLetters++;
			}
			else
			{
				consecutiveLetters = 0;
			}
			// Generate a new character if there were too many consecutive ones
			if (consecutiveLetters > 2 || consecutiveDigits > 3 )
			{
				i--;
				continue;
			}
			result += random;
			// Regenerate the password if it contains the uesr's name
			if (result.indexOf(firstName) != -1 || result.indexOf(lastName) != -1)
			{
				i = 0;
				consecutiveLetters = 0;
				consecutiveDigits = 0;
				result = "";
			}
		}

		System.out.println(result);
		in.close();
	}
	
	// Ignore this--if you want to come look at this code after module 5, 
	// you should be able to understands everything here then. 
	public static char[] genCharacters()
	{
		char[] result = new char[72];
		int index = 0; 
		for (int i = 48; i < 58; i++)
		{
			result[index]=(char)i;
			index++;
		}
		for (int i = 63; i < 91; i++)
		{
			result[index]=(char)i;
			index++;
		}
		for(int i = 91; i < 123; i++)
		{
			result[index]=(char)i;
			index++;
		}
		result[index] = '!';
		result[index+1] = '_';
		result[index+1] = '&';
		return result;
	}
}
