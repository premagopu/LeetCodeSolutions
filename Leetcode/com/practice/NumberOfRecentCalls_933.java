package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls_933 {
	
	// O(p) - (number of queries) time complexity 
	// O(1) - space complexity
	public static class RecentCounter {
		Queue<Integer> q;

		public RecentCounter() {
			q = new LinkedList<>();
		}

		public int ping(int t) {
			q.add(t);
			while (q.peek() < (t - 3000)) {
				q.poll();
			}
			return q.size();
		}

	}

	/**
	 * Your RecentCounter object will be instantiated and called as such:
	 * RecentCounter obj = new RecentCounter(); int param_1 = obj.ping(t);
	 */
	public static void main(String[] args) {
		RecentCounter obj = new RecentCounter();
		System.out.println(obj.ping(642));
		System.out.println(obj.ping(1849));
		System.out.println(obj.ping(4921));
		System.out.println(obj.ping(5936));

	}

}
