package com.practice;

public class SearchInRotatedSortedArray_33 {

	public static void main(String[] args) {

		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
	}

	// O(log n) time complexity
	// O(1) space complexity

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] >= nums[start]) {
				if (target >= nums[start] && target < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			} else {
				if (target <= nums[end] && target > nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
