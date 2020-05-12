package com.practice;

public class TwoSumII_167 {

	// O(n) time complexity
	// O(1) space complexity
	public static void main(String[] args) {
		twoSum(new int[] { 2, 7, 11, 15 }, 9);
	}

	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				return new int[] { i + 1, j + 1 };
			} else if (numbers[i] + numbers[j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return null;
	}
}
