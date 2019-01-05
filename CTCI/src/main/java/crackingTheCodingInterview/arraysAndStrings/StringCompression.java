package crackingTheCodingInterview.arraysAndStrings;

/**
 * @author nirbhaykekre
 * 
 * Solution to problem statement 1.6
 * 
 * String Compression: Implement a method to perform basic string
 * compression using the counts of repeated characters. For example, the
 * string aabcccccaaa would become a2b1c5a3. If the "compressed" string
 * would not become smaller than the original string, your method should
 * return the original string. You can assume the string has only
 * uppercase and lowercase letters (a - z).
 *
 */
public class StringCompression {

	public String compress(String str) {
		if (str.length() <= 2) {
			return str;
		}
		StringBuilder builder = new StringBuilder("" + str.charAt(0));
		char currChar = str.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (currChar == str.charAt(i)) {
				count++;
			} else {
				currChar = str.charAt(i);
				builder.append(count + "" + currChar);
				count = 1;
			}
		}
		builder.append(count);

		return builder.toString().length() >= str.length() ? str : builder.toString();
	}

}
