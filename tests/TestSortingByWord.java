package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import  app.MainFile;

class TestSortingByWord {

	@Test
	void testAverageString() {
		String message = "a man went down to the boy's";
		String expected = "a boy's down man the to went";
		
		System.out.println("Testing: " + message);
		System.out.println("Correct output: " + expected);
		assertEquals(expected, MainFile.sortByFirstLetter(message));
		System.out.println("Success!\n");
	}
	
	@Test
	void testCompleteReverse() {
		String message = "Zach sent Ronny Ribbon next door again";
		String expected = "again door next ribbon ronny sent zach";

		System.out.println("Testing: " + message);
		System.out.println("Correct output: " + expected);
		assertEquals(expected, MainFile.sortByFirstLetter(message));
		System.out.println("Success!\n");
	}
	
	@Test
	void testNoChanges() {
		String message = "ack! I see you, Zelda";
		String expected = "ack! i see you, zelda";

		System.out.println("Testing: " + message);
		System.out.println("Correct output: " + expected);
		assertEquals(expected, MainFile.sortByFirstLetter(message));
		System.out.println("Success!\n");
	}

}
