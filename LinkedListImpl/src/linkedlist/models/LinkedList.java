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
}
