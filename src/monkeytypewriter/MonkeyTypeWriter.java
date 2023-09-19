package monkeytypewriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonkeyTypeWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the monkey on a typewriter simulation.");
		System.out.println("What would you like to find?");
		String targetWord = in.next();
		int targetSize = targetWord.length();
		System.out.println();
		
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		//List<String> typeWriter = new ArrayList<String>();
		
		int counter = 0;
		 
		String paper = "";
		
		while(true) {
			int random = (int)(Math.random()*26);
			String newLetter = alphabet[random];
			System.out.print(newLetter);
			counter++;
			if(counter > 50) {
				System.out.println();
				counter = 0;
			}
			paper = paper + newLetter;
			if (paper.length() >= targetSize) {
				String checker = paper.substring(paper.length() - targetSize, paper.length());
				if (checker.equals(targetWord)) {
					break;
				}
			}
			
		}
		System.out.println();
		System.out.println("Expected number of characters: " + Math.pow(26, targetWord.length()));
		System.out.println("Characters generated: " + paper.length());
		

	}

}
