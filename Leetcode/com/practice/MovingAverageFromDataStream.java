package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {

	// O(1) time complexity
	// O(q) size of the queue space complexity
	static class MovingAverage {

		Queue<Integer> q;
		int sum;
		int size;

		/** Initialize your data structure here. */
		public MovingAverage(int size) {
			q = new LinkedList<>();
			this.size = size;
		}

		public double next(int val) {
			q.add(val);
			sum += val;
			if (q.size() > size) {
				sum -= q.poll();
			}

			return (double) sum / q.size();

		}
	}

	public static void main(String[] args) {
		MovingAverage obj = new MovingAverage(3);
		System.out.println(obj.next(1));
		System.out.println(obj.next(10));
		System.out.println(obj.next(3));
		System.out.println(obj.next(5));

	}

}
