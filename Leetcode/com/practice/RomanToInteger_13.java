package com.practice;

import java.util.HashMap;

public class RomanToInteger_13 {

	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt2("IV"));
	}

	// approach 1
	public static int romanToInt(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int sum = 0;
		char next = ' ';
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			next = (i != 0) ? s.charAt(i - 1) : s.charAt(i);
			sum += hm.get(c);
			if (c == 'V' || c == 'X') {
				if (next == 'I') {
					sum -= hm.get('I');
					i--;
				}
			} else if (c == 'L' || c == 'C') {
				if (next == 'X') {
					sum -= hm.get('X');
					i--;
				}
			} else if (c == 'D' || c == 'M') {
				if (next == 'C') {
					sum -= hm.get('C');
					i--;
				}
			}
		}
		return sum;
	}

	// approach 2

	public static int romanToInt2(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int sum = 0;
		char prev = ' ';
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			prev = (i != 0) ? s.charAt(i - 1) : s.charAt(i);
			sum += hm.get(c);
			if (hm.get(c) > hm.get(prev)) {
				sum -= hm.get(prev);
				i--;
			}
		}
		return sum;
	}

}
