package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OneAwayTest {
	public static final OneAway instance = new OneAway();
	
	@Test
	public void myTest1() {
		assertTrue(instance.isOneAway("pale", "ple"));
	}
	
	@Test
	public void myTest2() {
		assertTrue(instance.isOneAway("pales", "pale"));
	}
	
	@Test
	public void myTest5() {
		assertTrue(instance.isOneAway("pale", "pales"));
	}
	
	@Test
	public void myTest3() {
		assertTrue(instance.isOneAway("pale", "bale"));
	}
	
	@Test
	public void myTest4() {
		assertFalse(instance.isOneAway("pale", "bake"));
	}
	
	@Test
	public void myTest6() {
		assertFalse(instance.isOneAway("pale", "bales"));
	}
}
