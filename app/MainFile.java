package app;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;

public class MainFile {

	public static String input;
	public static String result;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Create a scanner for input
		
	    System.out.println("Please enter a string below:");
	    input = scan.nextLine(); // Read the user's input string

	    // ask the user which way they want the string to be sorted
	    System.out.println("Sort as words? (y/n)"); 
	    String sortWord = (scan.nextLine());
	    
	    if(sortWord.equals("y") || sortWord.equals("Y"))
	    	result = sortByFirstLetter(input);
	    else {
	    	System.out.println("Sort all characters? (y/n)");
		    String sortChars = (scan.nextLine());
	    	result = (sortChars.equals("y") || sortChars.equals("Y")) ? sortByAllCharacters(input) : input;
	    }
	    
	    System.out.println("\nYou entered:\n " + input.toLowerCase());
	    System.out.println("Result:\n" +result);  // Output user input
		
	    scan.close(); // Close the scanner to avoid memory leak
	}
	
	// Sort the string as an array of strings. That is, the words will be put in alphabetical order
	public static String sortByFirstLetter(String in) {
		String[] strArr = in.toLowerCase().split(" "); //Take in the string and turn it into an array of strings
		Arrays.sort(strArr);
		
		// Concatenate all of the strings back into a single string
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			res.append(strArr[i] + " ");
        }      
		return res.toString().trim();
	}
	
	// Sort the string's characters. That is, all the characters will be put in alphabetical order
	public static String sortByAllCharacters(String in) {
		char[] charArr = in.toLowerCase().toCharArray(); //Take in the string and turn it into an array of chars
		Arrays.sort(charArr);
		
		// Concatenate all of the chars back into a single string
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < charArr.length; i++) {
			res.append(charArr[i]);
        }  
		return res.toString().trim();
	}

}
