package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringRotationTest {
	private static final StringRotation instance = new StringRotation();
	@Test
	public void myTest1() {
		assertTrue(instance.isRotation("erbottlewat", "waterbottle"));
	}
	
	@Test
	public void myTest2() {
		assertFalse(instance.isRotation("erbottlewak", "waterbottle"));
	}
}
