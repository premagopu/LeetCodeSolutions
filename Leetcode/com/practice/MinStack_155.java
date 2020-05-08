package com.practice;

import java.util.Stack;

public class MinStack_155 {

	public static void main(String[] args) {

		MinStack_155 obj = new MinStack_155();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		int param_3 = obj.getMin();
		obj.pop();
		int param_4 = obj.top();
		int param_5 = obj.getMin();
		System.out.println(param_3 + "  " + param_4 + "  " + param_5);

	}

	Stack<int[]> s;

	public MinStack_155() {
		s = new Stack<>();
	}

	public void push(int x) {
		if (s.isEmpty()) {
			s.push(new int[] { x, x });
		} else {
			int min = s.peek()[1];
			s.push(new int[] { x, Math.min(x, min) });
		}
	}

	public void pop() {
		s.pop();
	}

	public int top() {
		return s.peek()[0];
	}

	public int getMin() {
		return s.peek()[1];
	}

}
