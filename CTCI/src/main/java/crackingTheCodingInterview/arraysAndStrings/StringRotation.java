package crackingTheCodingInterview.arraysAndStrings;

/**
 * @author nirbhaykekre
 *
 * Solution to problem statement 1.9
 * 
 * Assumeyou have a method isSubstringwhich checks if one word is a
 * substring of another. Given two strings, sl and s2, write code to
 * check if s2 is a rotation of sl using only one call to isSubstring
 * (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */
public class StringRotation {

	public boolean isRotation(String s1, String s2) {
		if (s1.length() == s2.length() && !s1.isEmpty()) {
			return (s1 + s1).contains(s2);
		}
		return false;
	}
}
