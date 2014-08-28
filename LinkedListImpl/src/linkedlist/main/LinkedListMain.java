package linkedlist.main;

import linkedlist.models.LinkedList;
import linkedlist.models.ListNode;

public class LinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.setHead(new ListNode(0));
		list.setHead(list.insertNodeInFront(10));
		list.setHead(list.insertNodeInLast(20));
		
		
		list.printList();
	}

}
