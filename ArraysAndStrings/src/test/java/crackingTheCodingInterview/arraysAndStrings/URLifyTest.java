package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class URLifyTest {
	
	public static final URLify instance = new URLify();
	
	@Test
	public void myTest1() {
		char[] input= "Mr John Smith    ".toCharArray();
		char[] expected = "Mr%20John%20Smith".toCharArray();
		
		instance.urlify(input, 13);
		assertArrayEquals(input, expected);
	}

}
