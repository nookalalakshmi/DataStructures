package linkedlist.main;

import linkedlist.controllers.LinkedListOperations;
import linkedlist.models.LinkedList;
import linkedlist.models.ListNode;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		LinkedListOperations listInsert = new LinkedListOperations(list);
		list.setHead(new ListNode(0));
		listInsert.insertBeforeNode(10,0);
		listInsert.insertAfterNode(20, 10);
		listInsert.insertBeforeNode(30, 10);
		listInsert.printList();
	}
}
