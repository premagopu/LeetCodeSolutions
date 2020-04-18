package com.practice;

public class Anagram_242 {

	public static void main(String[] args) {

		System.out.println(isAnagram("anagram", "nagaram"));

	}

	// O(n) - time complexity
	// O(1) - space complexity

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] result = new int[26];
		for (char c1 : s.toCharArray()) {
			result[c1 - 'a']++;
		}
		for (char c2 : t.toCharArray()) {
			result[c2 - 'a']--;
		}
		for (int c : result) {
			if (c != 0) {
				return false;
			}
		}
		return true;
	}
}
