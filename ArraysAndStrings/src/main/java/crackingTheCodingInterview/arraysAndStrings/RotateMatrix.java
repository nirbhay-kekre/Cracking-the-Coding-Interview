package crackingTheCodingInterview.arraysAndStrings;

/**
 * @author nirbhaykekre
 * 
 * Solution to problem statement 1.7
 * 
 * Rotate Matrix: Given an image represented by an NxN matrix, where
 * each pixel in the image is 4 bytes, write a method to rotate the
 * image by 90 degrees. Can you do this in place?
 *
 */
public class RotateMatrix {

	public int[][] rotate90(int[][] matrix) {
		int level = 0, len = matrix.length;
		int levelCounts = len / 2;
		while (levelCounts-- > 0) {
			for (int i = 0; i < len - 1; i++) {
				int temp = matrix[level][level + i];
				matrix[level][level + i] = matrix[level + len - 1 - i][level];
				matrix[level + len - 1 - i][level] = matrix[level + len - 1][level + len - 1 - i];
				matrix[level + len - 1][level + len - 1 - i] = matrix[level + i][level + len - 1];
				matrix[level + i][level + len - 1] = temp;
			}
			len -= 2;
			level++;
		}
		return matrix;
	}

}
