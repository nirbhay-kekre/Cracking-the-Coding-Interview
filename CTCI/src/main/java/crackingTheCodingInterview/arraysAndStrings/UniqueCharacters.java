package crackingTheCodingInterview.arraysAndStrings;

/**
 * @author nirbhaykekre
 * 
 * Solution to problem statement 1.1
 * 
 * Algorithm to determine if a string has all unique characters, what if we cannot use additional data structures
 *
 */
public class UniqueCharacters {

	public boolean isUniqueCharacters(String str) {
		int validator =0;
		char[] charachters = str.toUpperCase().toCharArray();
		for (char ch : charachters) {
			if(ch==' ') {
				continue;
			}
			if((1<<(ch-65)&validator)!=0) {
				return false;
			}
			validator |= 1<<(ch-65);
		}
		return true;
	}
}
