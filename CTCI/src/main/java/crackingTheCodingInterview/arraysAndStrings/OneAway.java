package crackingTheCodingInterview.arraysAndStrings;

/**
 * @author nirbhaykekre
 * Solution to problem statement 1.5
 * 
 * One Away: There are three types of edits that can be performed on
 * strings: insert a character, remove a character, or replace a
 * character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 *
 */
public class OneAway {
	
	public boolean isOneAway(String src, String tar) {
		int lengthDiff =0;
		if((lengthDiff = (src.length() -tar.length()))!=0 && Math.abs(lengthDiff) != 1) {
			return false;
		}
		boolean isDiffFound =false;
		int i=0,j=0;
		while(i<src.length() && j< tar.length()) {
			if(src.charAt(i) == tar.charAt(j)) {
				i++;
				j++;
				continue;
			}
			else {
				if(isDiffFound) {
					return false;
				}else {
					isDiffFound = true;
					if(lengthDiff ==0) {
						i++;j++;
					}else if(lengthDiff ==1) {
						i++;
					}else if(lengthDiff ==-1) {
						j++;
					}
				}
				
			}
		}
		return true;

	}

}
