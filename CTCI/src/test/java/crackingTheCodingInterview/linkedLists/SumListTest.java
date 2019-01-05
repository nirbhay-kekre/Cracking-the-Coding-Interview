package crackingTheCodingInterview.linkedLists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumListTest {

	@Test
	public void myTest1() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addToTail(7);
		linkedList.addToTail(1);
		linkedList.addToTail(6);
		
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.addToTail(5);
		linkedList2.addToTail(9);
		linkedList2.addToTail(2);
		
		LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
		linkedList3.addToTail(2);
		linkedList3.addToTail(1);
		linkedList3.addToTail(9);
		
		assertEquals(linkedList3, LinkedList.SumList(linkedList, linkedList2));
	}
	
	@Test
	public void myTest2() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addToTail(9);
		linkedList.addToTail(9);
		linkedList.addToTail(9);
		
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.addToTail(9);
		linkedList2.addToTail(9);
		linkedList2.addToTail(9);
		linkedList2.addToTail(9);
		
		LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
		linkedList3.addToTail(8);
		linkedList3.addToTail(9);
		linkedList3.addToTail(9);
		linkedList3.addToTail(0);
		linkedList3.addToTail(1);
		
		assertEquals(linkedList3, LinkedList.SumList(linkedList, linkedList2));
	}
}
