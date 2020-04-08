package com.practice;

import java.util.HashMap;

public class MajorityElement_169 {

	// O(n) - time complexity
	// O(n) - space complexity

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

	}

	public static int majorityElement(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int n : nums) {
			if (hm.containsKey(n)) {
				int value = hm.get(n) + 1;
				if (value > nums.length / 2) {
					return n;
				}
				hm.put(n, value);
			} else {
				hm.put(n, 1);
			}
		}
		return 0;

	}

}
