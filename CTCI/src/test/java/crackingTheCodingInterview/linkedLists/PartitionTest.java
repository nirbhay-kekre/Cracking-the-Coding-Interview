package crackingTheCodingInterview.linkedLists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PartitionTest {

	@Test
	public void myTest1() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addToTail(3);
		linkedList.addToTail(5);
		linkedList.addToTail(8);
		linkedList.addToTail(5);
		linkedList.addToTail(10);
		linkedList.addToTail(2);
		linkedList.addToTail(1);
		
		LinkedList<Integer> linkedListExpected = new LinkedList<Integer>();
		linkedListExpected.addToTail(3);
		linkedListExpected.addToTail(2);
		linkedListExpected.addToTail(1);
		linkedListExpected.addToTail(5);
		linkedListExpected.addToTail(5);
		linkedListExpected.addToTail(8);
		linkedListExpected.addToTail(10);
		
		linkedList.partition(5);
		
		assertEquals(linkedListExpected, linkedList);
	
	}
	
	@Test
	public void myTest2() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addToTail(3);
		linkedList.addToTail(5);
		linkedList.addToTail(8);
		linkedList.addToTail(5);
		linkedList.addToTail(10);
		linkedList.addToTail(2);
		linkedList.addToTail(1);
		
		LinkedList<Integer> linkedListExpected = new LinkedList<Integer>();
		linkedListExpected.addToTail(3);
		linkedListExpected.addToTail(5);
		linkedListExpected.addToTail(8);
		linkedListExpected.addToTail(5);
		linkedListExpected.addToTail(10);
		linkedListExpected.addToTail(2);
		linkedListExpected.addToTail(1);
		
		linkedList.partition(0);
		
		assertEquals(linkedListExpected, linkedList);
	
	}
	
	@Test
	public void myTest3() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addToTail(3);
		linkedList.addToTail(5);
		linkedList.addToTail(8);
		linkedList.addToTail(5);
		linkedList.addToTail(10);
		linkedList.addToTail(2);
		linkedList.addToTail(1);
		
		LinkedList<Integer> linkedListExpected = new LinkedList<Integer>();
		linkedListExpected.addToTail(3);
		linkedListExpected.addToTail(5);
		linkedListExpected.addToTail(8);
		linkedListExpected.addToTail(5);
		linkedListExpected.addToTail(10);
		linkedListExpected.addToTail(2);
		linkedListExpected.addToTail(1);
		
		linkedList.partition(20);
		
		assertEquals(linkedListExpected, linkedList);
	
	}
	
	@Test
	public void myTest4() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> linkedListExpected = new LinkedList<Integer>();
		
		linkedList.partition(0);
		
		assertEquals(linkedListExpected, linkedList);
	
	}
}
