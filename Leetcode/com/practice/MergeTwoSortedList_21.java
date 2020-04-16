package com.practice;

import com.practice.helper.ListNode;

public class MergeTwoSortedList_21 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		mergeTwoLists(l1, l2);
	}

	// O(l1+l2) time complexity
	// O(1) space complexity

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode temp = result;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				result.next = l1;
				l1 = l1.next;
			} else {
				result.next = l2;
				l2 = l2.next;
			}
			result = result.next;
		}

		result.next = (l1 == null) ? l2 : l1;

		return temp.next;
	}

	// O(l1+l2) time complexity
	// O(l1+l2) space complexity

	public static ListNode recursivemergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}

	}
}
