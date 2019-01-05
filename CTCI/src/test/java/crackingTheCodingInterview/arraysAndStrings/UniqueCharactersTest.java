package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import crackingTheCodingInterview.arraysAndStrings.UniqueCharacters;

public class UniqueCharactersTest {
	private static final UniqueCharacters instance = new UniqueCharacters();

	@Test
	public void smallCapsUniqueChars() {
		assertTrue(instance.isUniqueCharacters("nirbhay"));
	}
	
	@Test
	public void allCapsUniqueChars() {
		assertTrue(instance.isUniqueCharacters("FRANCE"));
	}
	
	@Test
	public void MixedCapsUniqueChars() {
		assertTrue(instance.isUniqueCharacters("NirBhAY"));
	}
	
	@Test
	public void MixedCapsNonUniqueChars() {
		assertFalse(instance.isUniqueCharacters("AmerICa"));
	}
	
	@Test
	public void allCapsNonUniqueChars() {
		assertFalse(instance.isUniqueCharacters("INDIA"));
	}
	
	@Test
	public void smallCapsNonUniqueChars() {
		assertFalse(instance.isUniqueCharacters("canada"));
	}
	
	@Test
	public void wordWithSpaces() {
		assertFalse(instance.isUniqueCharacters("Sri Lanka"));
	}
}
