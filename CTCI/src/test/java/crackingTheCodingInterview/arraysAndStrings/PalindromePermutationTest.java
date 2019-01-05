package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromePermutationTest {

	private static final PalindromePermutation instance = new PalindromePermutation();

	@Test
	public void validPalindromePermutation() {
		assertTrue(instance.isPalindromePermutation("Tact Coa"));
	}
	
	@Test
	public void validPalindromePermutation2() {
		assertTrue(instance.isPalindromePermutation("tattartartta"));
	}
	
	@Test
	public void invalidPalindromePermutation() {
		assertFalse(instance.isPalindromePermutation("Tract Coa"));
	}
}
