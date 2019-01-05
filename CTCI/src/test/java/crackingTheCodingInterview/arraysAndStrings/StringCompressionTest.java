package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompressionTest {

	private static final StringCompression instance = new StringCompression();
	
	@Test
	public void myTest1() {
		assertEquals("a2b1c5a3", instance.compress("aabcccccaaa"));
	}
	
	@Test
	public void myTest2() {
		assertEquals("hello", instance.compress("hello"));
	}
	
	@Test
	public void myTest3() {
		assertEquals("helllo", instance.compress("helllo"));
	}
	
	@Test
	public void myTest4() {
		assertEquals("helllllo", instance.compress("helllllo"));
	}
	
	@Test
	public void myTest5() {
		assertEquals("h1e1l6o1", instance.compress("hellllllo"));
	}
}
