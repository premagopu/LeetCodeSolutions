package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		permute(nums);

	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		permutation(nums, 0, result);
		return result;

	}

	public static void permutation(int[] nums, int pos, List<List<Integer>> result) {

		if (pos >= nums.length) {
			List<Integer> r = new ArrayList<>();
			for (int i : nums) {
				r.add(i);
			}
			result.add(r);
		}

		for (int i = pos; i < nums.length; i++) {
			swap(nums, pos, i);
			permutation(nums, pos + 1, result);
			swap(nums, pos, i);
		}

	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
