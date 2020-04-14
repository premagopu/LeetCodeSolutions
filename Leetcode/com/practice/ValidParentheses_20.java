package com.practice;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses_20 {

	public static void main(String[] args) {
		System.out.println(isValid("(])"));
	}

	public static boolean isValid(String s) {
		HashMap<Character, Character> hm = new HashMap<>();
		hm.put(')', '(');
		hm.put('}', '{');
		hm.put(']', '[');
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (hm.containsKey(c)) {
				char top = st.isEmpty() ? '*' : st.pop();
				if (top != hm.get(c)) {
					return false;
				}
			} else {
				st.push(c);
			}
		}

		return st.isEmpty();

	}

}
