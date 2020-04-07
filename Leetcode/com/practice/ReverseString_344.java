package com.practice;

public class ReverseString_344 {

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(reverseString(s));
	}

	// in-place reverse string
	public static char[] reverseString(char[] s) {
		int j = 0;
		int i = s.length - 1;
		while (j < i) {
			char temp = s[j];
			s[j] = s[i];
			s[i] = temp;
			j++;
			i--;
		}
		return s;
	}
}
