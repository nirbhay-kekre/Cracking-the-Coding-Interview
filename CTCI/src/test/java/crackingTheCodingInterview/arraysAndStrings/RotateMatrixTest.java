package crackingTheCodingInterview.arraysAndStrings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotateMatrixTest {

	private static final RotateMatrix instance = new RotateMatrix();

	@Test
	public void myTest1() {
		assertEquals(
			new int[][] {
			{ 21,16,11,6,1},
			{ 22, 17, 12, 7,2},
			{23,18,13,8,3},
			{24,19,14,9,4},
			{25,20,15,10,5}
			},
			instance.rotate90(new int[][] {
			{ 1,  2,  3,  4,  5 },
			{ 6,  7,  8,  9,  10 },
			{ 11, 12, 13, 14, 15 },
			{ 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 } }));
	}
	
	@Test
	public void myTest2() {
		assertEquals(
			new int[][] {
				{ 13,  9,  5,  1},
				{ 14, 10,  6,  2},
				{ 15, 11,  7,  3},
				{ 16, 12,  8,  4}
			},
			instance.rotate90(new int[][] {
			{  1,  2,  3,  4 },
			{  5,  6,  7,  8 },
			{  9, 10, 11, 12 },
			{ 13, 14, 15, 16 } }));
	}

}
