package com.practice.helper;

public class ListNode {
	int val;
	public ListNode next;
	public ListNode(int x) { val = x; }
	
	public ListNode() {
		// TODO Auto-generated constructor stub
	}

	public void display(ListNode head){

		if(head == null) {
			System.out.println("Empty Node!");
		}
		
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
		 System.out.println();
		
	}
}
