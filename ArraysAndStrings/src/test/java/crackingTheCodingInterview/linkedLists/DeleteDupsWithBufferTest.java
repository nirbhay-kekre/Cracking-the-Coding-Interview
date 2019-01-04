package crackingTheCodingInterview.linkedLists;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class DeleteDupsWithBufferTest {
	
	@Test
	public void myTest1() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> linkedListExpected = new LinkedList<>();
		
		Collection<Integer> collection = new ArrayList<>();
		
		collection.add(1);
		collection.add(1);
		linkedList.addAll(collection);
		
		Collection<Integer> collectionExpected = new ArrayList<Integer>();
		collectionExpected.add(1);
		linkedListExpected.addAll(collectionExpected);
		
		linkedList.deleteDuplicatesWithBuffer();
		assertEquals(linkedListExpected, linkedList);
	}
	
	@Test
	public void myTest2() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> linkedListExpected = new LinkedList<>();
		
		Collection<Integer> collection = new ArrayList<>();
		
		collection.add(1);
		collection.add(3);
		collection.add(2);
		collection.add(2);
		collection.add(3);
		linkedList.addAll(collection);
		
		Collection<Integer> collectionExpected = new ArrayList<Integer>();
		collectionExpected.add(1);
		collectionExpected.add(3);
		collectionExpected.add(2);
		linkedListExpected.addAll(collectionExpected);
		
		linkedList.deleteDuplicatesWithBuffer();
		
		assertEquals(linkedListExpected, linkedList);
	}
	
	@Test
	public void myTest3() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> linkedListExpected = new LinkedList<>();
		
		Collection<Integer> collection = new ArrayList<>();
		linkedList.addAll(collection);
		
		Collection<Integer> collectionExpected = new ArrayList<Integer>();
		linkedListExpected.addAll(collectionExpected);
		
		linkedList.deleteDuplicatesWithBuffer();
		
		assertEquals(linkedListExpected, linkedList);
	}

}
