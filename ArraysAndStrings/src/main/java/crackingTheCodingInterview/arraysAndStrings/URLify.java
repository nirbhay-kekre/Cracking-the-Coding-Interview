package crackingTheCodingInterview.arraysAndStrings;

/**
 * @author nirbhaykekre
 *
 * Solution to problem statement 1.3
 * 
 * write a method to replace all spaces with '%20', you can assume
 * string has sufficient space st the end to hold the additional
 * characters, and that you are given the true length of the string
 */
public class URLify {

	public void urlify(char[] str, int trueLength) {
		int spaces = 0;
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaces++;
			}
		}
		int newLen = trueLength + 2 * spaces;
		if (str.length < newLen) {
			return;
		}
		int j = newLen;
		for (int i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[j - 1] = '0';
				str[j - 2] = '2';
				str[j - 3] = '%';
				j -= 3;
			} else {
				str[--j] = str[i];
			}
		}
	}
}
