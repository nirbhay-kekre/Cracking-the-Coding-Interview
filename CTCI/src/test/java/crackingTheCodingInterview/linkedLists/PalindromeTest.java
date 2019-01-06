package crackingTheCodingInterview.linkedLists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void myTest1() {
		LinkedList<Character> linkedList = new LinkedList<>();
		assertFalse(linkedList.isPalindrome());
	}
	
	@Test
	public void myTest2() {
		LinkedList<Character> linkedList = new LinkedList<>();
		linkedList.addToTail('t');
		assertTrue(linkedList.isPalindrome());
	}
	
	@Test
	public void myTest3() {
		LinkedList<Character> linkedList = new LinkedList<>();
		linkedList.addToTail('t');
		linkedList.addToTail('a');
		linkedList.addToTail('c');
		linkedList.addToTail('o');
		linkedList.addToTail('c');
		linkedList.addToTail('a');
		linkedList.addToTail('t');
		assertTrue(linkedList.isPalindrome());
	}
	
	@Test
	public void myTest8() {
		LinkedList<Character> linkedList = new LinkedList<>();
		linkedList.addToTail('t');
		linkedList.addToTail('a');
		linkedList.addToTail('c');
		linkedList.addToTail('o');
		linkedList.addToTail('c');
		linkedList.addToTail('a');
		linkedList.addToTail('c');
		assertFalse(linkedList.isPalindrome());
	}
	
	@Test
	public void myTest4() {
		LinkedList<Character> linkedList = new LinkedList<>();
		linkedList.addToTail('t');
		linkedList.addToTail('a');
		linkedList.addToTail('c');
		linkedList.addToTail('c');
		linkedList.addToTail('a');
		linkedList.addToTail('t');
		assertTrue(linkedList.isPalindrome());
	}
	
	@Test
	public void myTest5() {
		LinkedList<Character> linkedList = new LinkedList<>();
		linkedList.addToTail('t');
		linkedList.addToTail('a');
		linkedList.addToTail('c');
		linkedList.addToTail('o');
		linkedList.addToTail('c');
		linkedList.addToTail('a');

		assertFalse(linkedList.isPalindrome());
	}
	
	@Test
	public void myTest6() {
		LinkedList<Character> linkedList = new LinkedList<>();
		linkedList.addToTail('a');
		linkedList.addToTail('b');
		assertFalse(linkedList.isPalindrome());
	}
	
	@Test
	public void myTest7() {
		LinkedList<Character> linkedList = new LinkedList<>();
		linkedList.addToTail('a');
		linkedList.addToTail('a');

		assertTrue(linkedList.isPalindrome());
	}
}
