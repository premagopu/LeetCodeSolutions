package com.practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

	public static void main(String[] args) {

		generateParenthesis(3);
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0, 0, 3);

	}

	// approach 1
	public static List<String> generateParenthesis(int n) {

		char[] c = new char[n * 2];
		List<String> result = new ArrayList<>();
		helper(c, result, 0);
		return result;

	}

	public static void helper(char[] c, List<String> result, int pos) {
		if (pos == c.length) {
			if (valid(c)) {
				result.add(new String(c));
			}
		} else {
			c[pos] = '(';
			helper(c, result, pos + 1);
			c[pos] = ')';
			helper(c, result, pos + 1);
		}

	}

	public static boolean valid(char[] ch) {
		int count = 0;
		for (char c : ch) {
			if (c == '(') {
				count++;
			} else {
				count--;
			}
			if (count < 0) {
				return false;
			}
		}

		return (count == 0);
	}

	// approach 2
	public static void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}

		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);
	}
}
