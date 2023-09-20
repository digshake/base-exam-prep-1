package For_Loop_Exploration;

import java.util.Scanner;

public class Password {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		char[] validCharacters = genCharacters();
		int length = in.nextInt();
		in.close();
		// TODO: generate a password length characters long. 
		/*
		 * Extra challenges:
		 * 1) Ensure there are no consecutive repeating characters
		 * ex: apple is invalid because of the consecutive letter p
		 * 2) Ensure the password doesn't contain the user's name
		 * 3) Ensure the password isn't just letters (and isn't just 
		 * numbers). 
		 */
		
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
