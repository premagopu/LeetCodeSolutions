package com.practice;

import java.util.Arrays;

public class ReorderDataInLogFiles_937 {

	// O(n log n) time complexity
	// O(n) space complexity
	public static void main(String[] args) {
		String[] logs = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };
		reorderLogFiles(logs);
	}

	public static String[] reorderLogFiles(String[] logs) {
		Arrays.sort(logs, (c, d) -> {
			String[] a = c.split(" ", 2);
			String[] b = d.split(" ", 2);
			boolean isDigita = Character.isDigit(a[1].charAt(0));
			boolean isDigitb = Character.isDigit(b[1].charAt(0));
			if (!isDigita && !isDigitb) {
				int i = a[1].compareTo(b[1]);
				if (i != 0)
					return i;
				return a[0].compareTo(b[0]);
			}
			return isDigita ? (isDigitb ? 0 : 1) : -1;
		});

		return logs;
	}
}
