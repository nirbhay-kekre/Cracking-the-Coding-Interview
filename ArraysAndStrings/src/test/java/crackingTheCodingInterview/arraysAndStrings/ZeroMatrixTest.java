package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZeroMatrixTest {
	private static final ZeroMatrix instance = new ZeroMatrix();
	
	@Test
	public void myTest1() {
		assertEquals( instance.convertToZeroMatrix(new int[][]{
			{1,2,3},
			{4,5,0},
			{7,8,9},
			{0,11,12}
		}),
				new int[][]{
			{0,2,0},
			{0,0,0},
			{0,8,0},
			{0,0,0}
		});
	}
}
