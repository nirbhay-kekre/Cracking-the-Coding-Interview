package crackingTheCodingInterview.arraysAndStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nirbhaykekre
 * 
 * Solution to problem statement 1.8
 * 
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 *
 */
public class ZeroMatrix {
	public int[][] convertToZeroMatrix(int[][] matrix) {
		Set<Integer> rows=  new HashSet<Integer>(), cols = new HashSet<Integer>();
		for(int i=0;i<matrix.length;i++) {
			for(int j=0; j< matrix[0].length; j++) {
				if(matrix[i][j] ==0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0; j< matrix[0].length; j++) {
				if(rows.contains(i)||cols.contains(j)) {
					matrix[i][j]=0;
				}
			}
		}
		
		return matrix;
	}
}
