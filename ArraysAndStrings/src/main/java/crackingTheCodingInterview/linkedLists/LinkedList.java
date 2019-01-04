package crackingTheCodingInterview.linkedLists;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LinkedList<T> {

	private SingleNode<T> head;
	private SingleNode<T> tail;

	public void addToHead(T data) {
		SingleNode<T> node = new SingleNode<T>(data);
		node.setNext(head);
		if(head==null && tail ==null) {
			tail=node;
		}
		head = node;
	}

	public void addToTail(T data) {
		SingleNode<T> node = new SingleNode<T>(data);
		if (tail != null) {
			tail.setNext(node);
		}
		else if(head==null){
			head=node;
		}
		tail = node;
	}

	public void addAll(Collection<T> collection) {
		for(T item: collection) {
			addToTail(item);
		}
		
	}
	
	/**
	 * Solution to 2.1
	 * 
	 * Remove duplicates with buffer
	 */
	public void deleteDuplicatesWithBuffer() {
		SingleNode<T> node = this.head;
		Set<T> set = new HashSet<T>();		
		while(node!=null) {
			set.add(node.getData());
			if(node.getNext()!=null && set.contains(node.getNext().getData())) {
				if(node.getNext() == tail) {
					tail = node;
				}
				node.setNext(node.getNext().getNext());
			}else {
				node = node.getNext();
			}
		}
	}

	/**
	 * Solution to 2.1
	 * 
	 * Remove duplicates without buffer
	 */
	public void deleteDuplicatesWithoutBuffer() {
		SingleNode<T> currentNode = this.head;
		while(currentNode != null && currentNode.getNext() != null) {
			SingleNode<T> anchor = currentNode;
			while(anchor!=null && anchor.getNext()!=null) {
				if(currentNode.getData().equals(anchor.getNext().getData())) {
					if(anchor.getNext() == tail) {
						tail = anchor;
					}
					anchor.setNext(anchor.getNext().getNext());
				}
				anchor = anchor.getNext();
			}
			currentNode = currentNode.getNext();
		}
	}
	
	public SingleNode<T> getHead() {
		return head;
	}


	public SingleNode<T> getTail() {
		return tail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + ((tail == null) ? 0 : tail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedList other = (LinkedList) obj;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		if (tail == null) {
			if (other.tail != null)
				return false;
		} else if (!tail.equals(other.tail))
			return false;
		return true;
	}
	
}
