package crackingTheCodingInterview.arraysAndStrings;


/**
 * @author nirbhaykekre
 *
 * Solution to problem statement 1.2
 * 
 * Given 2 Strings, write a method to decide if one is a permutation of the other
 */
public class CheckPermutation {
	public boolean checkPermutaiton(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int[] freq =new int[128];
		for(int i=0; i<str1.length();i++) {
			freq[str1.charAt(i)]++;
			freq[str2.charAt(i)]--;
		}
		
		for(int a : freq) {
			if(a !=0) {
				return false;
			}
		}
		
		return true;
	}
}
