package app;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;

public class MainFile {

	public static StringBuilder input;
	public static String result;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Create a scanner for input
		
	    System.out.println("Please enter a string below:");
	    input = new StringBuilder(scan.nextLine());  // Read the user's input string

	    System.out.println("Sort as words? (y/n)");
	    String sortWord = (scan.nextLine());
	    
	    System.out.println("\nYou entered:\n " + input.toString().toLowerCase());
	    
	    result = (sortWord.equals("y") || sortWord.equals("Y")) ? sortByFirstLetter(input.toString()) : input.toString();
	    
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

}
