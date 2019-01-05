package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckPermutationTest {
	public static final CheckPermutation instance = new CheckPermutation();
	
	@Test
	public void validPermutationCase() {
		assertTrue(instance.checkPermutaiton("hello", "eolhl"));
	}
	
	@Test
	public void invalidPermutationCase() {
		assertFalse(instance.checkPermutaiton("lhoal", "eolhl"));
	}
	
	@Test
	public void invalidPermutationCase1() {
		assertFalse(instance.checkPermutaiton("abb", "aab"));
	}
	
	@Test
	public void invalidPermutationCase2() {
		assertFalse(instance.checkPermutaiton("bb", "aa"));
	}
	
}
