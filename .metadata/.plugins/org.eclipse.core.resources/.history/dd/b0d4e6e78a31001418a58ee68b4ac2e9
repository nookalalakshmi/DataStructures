package linkedlist.models;

import java.util.ArrayList;

public class LinkedList {
	
	private ArrayList<ListNode> list;
	private ListNode head;

	public ArrayList<ListNode> getList() {
		return list;
	}
	public void setList(ArrayList<ListNode> list) {
		this.list = list;
	}
	public ListNode getHead() {
		return head;
	}
	public void setHead(ListNode head) {
		this.head = head;
	}
	
	public ListNode insertNodeInFront(int data)
	{
		ListNode newNode = new ListNode(data);
		newNode.setNext(head);
		head = newNode;
		return head;
	}

	public ListNode insertNodeInLast(int data)
	{
		ListNode temp = head;
		ListNode newNode = new ListNode(data);
		while(temp.getNext() !=  null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
		
		return head;
	}
	
	public void printList()
	{
		ListNode temp  = head;
		
		while(temp != null)
		{
			System.out.println("Node data : "+temp.getData());
			temp = temp.getNext();
		}
	}

}
