package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import  app.MainFile;

class TestSortingByCharacters {

	@Test
	void testAverageString() {
		String message = "The next two are very hard";
		String expected = "aadeeeehhnorrrtttvwxy";
		
		System.out.println("Testing: " + message);
		System.out.println("Correct output: " + expected);
		assertEquals(expected, MainFile.sortByAllCharacters(message));
		System.out.println("Success!\n");
	}
	
	@Test
	void testCompleteReverse() {
		String message = "zzzs soon med";
		String expected = "demnoosszzz";

		System.out.println("Testing: " + message);
		System.out.println("Correct output: " + expected);
		assertEquals(expected, MainFile.sortByAllCharacters(message));
		System.out.println("Success!\n");
	}
	
	@Test
	void testNoChanges() {
		String message = "ace for stu";
		String expected = "aceforstu";

		System.out.println("Testing: " + message);
		System.out.println("Correct output: " + expected);
		assertEquals(expected, MainFile.sortByAllCharacters(message));
		System.out.println("Success!\n");
	}

}
