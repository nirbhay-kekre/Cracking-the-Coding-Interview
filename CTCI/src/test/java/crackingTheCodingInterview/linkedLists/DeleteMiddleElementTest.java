package crackingTheCodingInterview.linkedLists;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class DeleteMiddleElementTest {
	
	@Test
	public void myTest1() {
		LinkedList<String> linkedList = new LinkedList<>();
		LinkedList<String> linkedListExpected = new LinkedList<>();
		
		linkedList.deleteMiddleNode();
		assertEquals(linkedListExpected, linkedList );
	}
	
	@Test
	public void myTest2() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addToTail("a");
		LinkedList<String> linkedListExpected = new LinkedList<>();
		
		linkedList.deleteMiddleNode();
		assertEquals(linkedListExpected, linkedList );
	}
	
	@Test
	public void myTest3() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addToTail("a");
		linkedList.addToTail("b");
		LinkedList<String> linkedListExpected = new LinkedList<>();
		linkedListExpected.addToTail("b");
		linkedList.deleteMiddleNode();
		assertEquals(linkedListExpected, linkedList );
	}
	
	@Test
	public void myTest4() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addToTail("a");
		linkedList.addToTail("b");
		linkedList.addToTail("c");
		LinkedList<String> linkedListExpected = new LinkedList<>();
		linkedListExpected.addToTail("a");
		linkedListExpected.addToTail("c");
		linkedList.deleteMiddleNode();
		assertEquals(linkedListExpected, linkedList );
	}
	
	@Test
	public void myTest5() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addToTail("a");
		linkedList.addToTail("b");
		linkedList.addToTail("c");
		linkedList.addToTail("d");
		LinkedList<String> linkedListExpected = new LinkedList<>();
		linkedListExpected.addToTail("a");
		linkedListExpected.addToTail("c");
		linkedListExpected.addToTail("d");
		linkedList.deleteMiddleNode();
		assertEquals(linkedListExpected, linkedList );
	}
	
	@Test
	public void myTest6() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addToTail("a");
		linkedList.addToTail("b");
		linkedList.addToTail("c");
		linkedList.addToTail("d");
		linkedList.addToTail("e");
		linkedList.addToTail("f");
		
		LinkedList<String> linkedListExpected = new LinkedList<>();
		linkedListExpected.addToTail("a");
		linkedListExpected.addToTail("b");
		linkedListExpected.addToTail("d");
		linkedListExpected.addToTail("e");
		linkedListExpected.addToTail("f");
		linkedList.deleteMiddleNode();
		assertEquals(linkedListExpected, linkedList );
	}
}
