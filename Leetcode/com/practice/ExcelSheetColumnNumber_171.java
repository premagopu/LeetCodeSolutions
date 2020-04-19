package com.practice;

public class ExcelSheetColumnNumber_171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AA"));
	}

	public static int titleToNumber(String s) {
		int col = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			col *= 26;
			col += (c[i] - 'A') + 1;
		}
		return col;
	}
}
