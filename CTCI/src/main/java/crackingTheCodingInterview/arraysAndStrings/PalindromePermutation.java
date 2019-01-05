package crackingTheCodingInterview.arraysAndStrings;

/**
 * @author nirbhaykekre
 * 
 * Solution to problem statement 1.4
 * 
 * Given a string, identify whether it is a permutation of a palindrome or not.
 *
 */
public class PalindromePermutation {

	public boolean isPalindromePermutation(String str) {
		str = str.toLowerCase();
		int validator = 0;
		for(int i= 0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			//flip bit at char num
			validator ^= 1<<(str.charAt(i)-'a');
		}
		//check if at max only one bit is set.
		return (validator & (validator-1))==0 ;
	}
}
