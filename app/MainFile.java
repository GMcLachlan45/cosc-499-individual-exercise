package app;
import java.lang.StringBuilder;
import java.util.Scanner;

public class MainFile {

	public static StringBuilder input;
	public static String result;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Create a scanner for input
	    System.out.println("Please enter a string below:");

	    input = new StringBuilder(scan.nextLine());  // Read the user's input
	    System.out.println(input);  // Output user input
		
	    scan.close(); // Close the scanner to avoid memory leak
	}

}
