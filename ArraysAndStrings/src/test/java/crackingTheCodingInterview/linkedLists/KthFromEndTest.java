package crackingTheCodingInterview.linkedLists;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class KthFromEndTest {

	@Test
	public void myTest1() {
		LinkedList<String> linkedList = new LinkedList<>();
		Collection<String> collection = new ArrayList<>();
		collection.add("Hello");
		collection.add("Linked");
		collection.add("List");
		collection.add("World");
		linkedList.addAll(collection);
		
		assertEquals(linkedList.kThFromLast(1), "World");
		assertEquals(linkedList.kThFromLast(2), "List");
		assertEquals(linkedList.kThFromLast(3), "Linked");
		assertEquals(linkedList.kThFromLast(4), "Hello");
		assertEquals(linkedList.kThFromLast(5), null);
		assertEquals(linkedList.kThFromLast(0), null);
		assertEquals(linkedList.kThFromLast(-1), null);
	}
	
	@Test
	public void myTest2() {
		LinkedList<String> linkedList = new LinkedList<>();
		
		assertEquals(linkedList.kThFromLast(1), null);

		assertEquals(linkedList.kThFromLast(5), null);
		assertEquals(linkedList.kThFromLast(0), null);
		assertEquals(linkedList.kThFromLast(-1), null);
	}
	
}
