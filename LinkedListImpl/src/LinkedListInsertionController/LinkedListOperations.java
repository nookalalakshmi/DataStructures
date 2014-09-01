package LinkedListInsertionController;

import linkedlist.models.LinkedList;
import linkedlist.models.ListNode;

public class LinkedListOperations {
	
	private LinkedList list;
	
	public LinkedListOperations(LinkedList list) {
	
		this.list = list;
	}
	
	public boolean insertBeforeNode(int data, int before)
	{
		ListNode newNode = new ListNode(data);
		
		ListNode temp =  list.getHead();
		
		if(list.getHead() == null)
		{
			list.setHead(newNode);
			return true;
		}
		
		else if(before == list.getHead().getData())
		{
			newNode.setNext(list.getHead());
			list.setHead(newNode);
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
					return true;
				}
				else
				{
					temp = temp.getNext();
				}
			}
			return false;
		}
	}
	
	public boolean insertAfterNode(int data, int after)
	{
		ListNode newNode = new ListNode(data);
		ListNode temp  = list.getHead();
		
		if(list.getHead() == null)
		{
			list.setHead(newNode);
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
					return true;
				}
				else
				{
					temp = temp.getNext();
				}
			}
		}
		return false;
	}
	
	public void printList()
	{
		ListNode temp  = list.getHead();
		
		while(temp != null)
		{
			System.out.println("Node data : "+temp.getData());
			temp = temp.getNext();
		}
	}

}
