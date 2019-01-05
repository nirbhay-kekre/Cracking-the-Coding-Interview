package crackingTheCodingInterview.linkedLists;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LinkedList<T extends Comparable> {

	protected SingleNode<T> head;
	protected SingleNode<T> tail;

	public void addToHead(T data) {
		SingleNode<T> node = new SingleNode<T>(data);
		node.setNext(head);
		if (head == null && tail == null) {
			tail = node;
		}
		head = node;
	}

	public void addToTail(T data) {
		SingleNode<T> node = new SingleNode<T>(data);
		if (tail != null) {
			tail.setNext(node);
		} else if (head == null) {
			head = node;
		}
		tail = node;
	}

	public void addAll(Collection<T> collection) {
		for (T item : collection) {
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
		while (node != null) {
			set.add(node.getData());
			if (node.getNext() != null && set.contains(node.getNext().getData())) {
				if (node.getNext() == tail) {
					tail = node;
				}
				node.setNext(node.getNext().getNext());
			} else {
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
		while (currentNode != null && currentNode.getNext() != null) {
			SingleNode<T> anchor = currentNode;
			while (anchor != null) {
				if (anchor.getNext() != null && currentNode.getData().equals(anchor.getNext().getData())) {
					if (anchor.getNext() == tail) {
						tail = anchor;
					}
					anchor.setNext(anchor.getNext().getNext());
				} else {
					anchor = anchor.getNext();
				}
			}
			currentNode = currentNode.getNext();
		}
	}

	/**
	 * Solution to problem statement 2.2
	 * 
	 * Return value at kth element from end.
	 * 
	 * @param k index from the end
	 * @return Value at k-th from end
	 */
	public T kThFromLast(int k) {
		if (k <= 0 || head == null) {
			return null;
		}
		int length = 0;
		SingleNode<T> node = head;
		SingleNode<T> node2 = head;
		while (node != null) {
			length++;
			if (length > k) {
				node2 = node2.getNext();
			}
			node = node.getNext();
		}
		if (length - k < 0) {
			return null;
		}

		return node2.getData();
	}

	/**
	 * Solution to problem statement 2.3
	 * 
	 * Remove middle element from the linked list
	 */
	public void deleteMiddleNode() {
		SingleNode<T> cursor = head;
		if (cursor == null) {
			return;
		}
		if (cursor.getNext() == null) {
			head = tail = null;
			return;
		}
		if (cursor.getNext().getNext() == null) {
			head = tail;
			return;
		}
		SingleNode<T> cursor2x = head;
		SingleNode<T> prev = null;

		while (cursor2x.getNext() != null && cursor2x.getNext().getNext() != null) {
			prev = cursor;
			cursor2x = cursor2x.getNext().getNext();
			cursor = cursor.getNext();
		}
		prev.setNext(prev.getNext().getNext());
	}

	/**
	 * Solution to problem statement 2.4
	 * 
	 * Write code to partition a linked list around a value x, such that all nodes
	 * less than x come before all nodes greater than or equal to x. If x is
	 * contained within the list, the values of x only need to be after the elements
	 * less than x (see below). The partition element x can appear anywhere in the
	 * "right partition"; it does not need to appear between the left and right
	 * partitions.
	 * 
	 * @param data: partition pivot
	 */
	public void partition(T data) {
		if (data == null) {
			return;
		}
		SingleNode<T> node = head;
		SingleNode<T> greater = null, smaller = null, smallerHead = null, greaterHead = null, pivotHead = null,
				pivot = null;

		while (node != null) {
			SingleNode<T> nextNode = node.getNext();
			if (node.getData().compareTo(data) < 0) {
				if (smaller == null) {
					smallerHead = smaller = node;
				} else {
					smaller.setNext(node);
					smaller = node;
				}
			} else if (node.getData().compareTo(data) > 0) {
				if (greater == null) {
					greaterHead = greater = node;
				} else {
					greater.setNext(node);
					greater = node;
				}
			} else {
				if (pivot == null) {
					pivotHead = pivot = node;
				} else {
					pivot.setNext(node);
					pivot = node;
				}
			}
			node.setNext(null);
			node = nextNode;
		}
		if (smallerHead != null) {
			head = smallerHead;
		} else if (pivotHead != null) {
			head = pivotHead;
		} else {
			head = greaterHead;
		}
		if (smaller != null) {
			smaller.setNext(pivotHead);
			tail = smaller;
		}
		if (pivot != null) {
			pivot.setNext(greaterHead);
			tail = pivot;
		}
		if (greater != null) {
			tail = greater;
		}
	}

	public SingleNode<T> getHead() {
		return head;
	}

	public SingleNode<T> getTail() {
		return tail;
	}
	
	public static LinkedList<Integer> SumList( LinkedList<Integer> first , LinkedList<Integer> second) {
		int rem = 0;
		SingleNode<Integer> node = first.head, secondNode = second.head;
		LinkedList<Integer> newList = new LinkedList<>();
		while(node != null && secondNode!=null) {
			Integer data = rem + node .getData() + secondNode.getData();
			rem = data /10;
			newList.addToTail(data%10);
			node = node.getNext();
			secondNode = secondNode.getNext();
		}
		while(node!=null) {
			Integer data = rem + node .getData();
			rem = data /10;
			newList.addToTail(data%10);
			node = node.getNext();
		}
		while(secondNode!=null) {
			Integer data = rem + secondNode .getData();
			rem = data /10;
			newList.addToTail(data%10);
			secondNode = secondNode.getNext();
		}
		while(rem != 0) {
			newList.addToTail(rem%10);
			rem=rem/10;
		}
		return newList;
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
