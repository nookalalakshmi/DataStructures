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

	public boolean insertBeforeNode(int data, int before)
	{
		ListNode newNode = new ListNode(data);
		
		ListNode temp =  this.head;
		
		if(head == null)
		{
			insertHead(data);
			return true;
		}
		
		else if(before == head.getData())
		{
			newNode.setNext(head);
			head = newNode;
			System.out.println("returning true from insertBeforeNode");
			return true;
		}
		else
		{
			while(temp.getNext() != null)
			{
				if(temp.getNext().getData() == before)
				{
					newNode.setNext(temp.getNext());
					temp.setNext(newNode);
					System.out.println("returning true from insertBeforeNode");
					return true;
				}
				else
				{
					temp = temp.getNext();
				}
			}
			System.out.println("returning false from insertBeforeNode");
			return false;
		}
	}
	
	public boolean insertAfterNode(int data, int after)
	{
		ListNode newNode = new ListNode(data);
		ListNode temp  = head;
		
		if(head == null)
		{
			insertHead(data);
			System.out.println("returning true from insertAfterNode, inserted head");
			return true;
		}
		else 
		{
			while(temp != null)
			{
				if(temp.getData() == after)
				{
					newNode.setNext(temp.getNext());
					temp.setNext(newNode);
					System.out.println("returning true from insertAfterNode");
					return true;
				}
				else
				{
					temp = temp.getNext();
				}
			}
		}
		System.out.println("returning false from insertAfterNode");
		return false;
	}
	
	public void insertHead(int data)
	{
		this.head = new ListNode(data);
		System.out.println("returning true from inserthead");
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
