package com.practice;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber_136 {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 1, 1 };
		System.out.println(singleNumber1(nums));
		System.out.println(singleNumber2(nums));
		System.out.println(singleNumberXOR(nums));

	}

	// O(n) - time complexity
	// O(n) - space complexity

	public static int singleNumber1(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (!hs.add(nums[i])) {
				hs.remove(nums[i]);
			}
		}

		return (int) hs.toArray()[0];
	}

	public static int singleNumber2(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.remove(nums[i]);
			} else {
				hm.put(nums[i], i);
			}
		}

		return (int) hm.keySet().iterator().next();
	}

	// O(n) - time complexity
	// O(1) - space complexity
	
	public static int singleNumberXOR(int[] nums) {
		int n = 0;
		for (int i : nums) {
			n ^= i;
		}
		return n;
	}

}
