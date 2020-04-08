package com.practice;

public class MoveZeroes_283 {

	// O(n) - time complexity
	// O(1) - space complexity

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		for (int n : nums) {
			System.out.println(n);
		}
	}

	public static void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}
		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}
	}
}
