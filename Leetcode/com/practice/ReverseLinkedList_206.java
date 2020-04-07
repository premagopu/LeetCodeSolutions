package com.practice;

import com.practice.helper.ListNode;

public class ReverseLinkedList_206 {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;

		ReverseLinkedList_206 rl = new ReverseLinkedList_206();
		rl.display(rl.reverseList(node1));
		// rl.display(rl.reverseLinkedListRecursive(node1));

	}

	// Iterative Approach
	// O(n) - time complexity
	// O(1) - space complexity
	ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode prev = null;
		ListNode nxt = null;
		while (current != null) {
			nxt = current.next;
			current.next = prev;
			prev = current;
			current = nxt;
		}
		head = prev;
		return head;

	}

	// Recursive Approach
	// O(n) - time complexity
	// O(n) - space complexity - implicit stack space due to recursion

	ListNode reverseLinkedListRecursive(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode result = reverseLinkedListRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return result;
	}

	public void display(ListNode curr) {
		ListNode head = curr;
		if (head == null) {
			System.out.println("Empty Node!");
		}

		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println();

	}
}
