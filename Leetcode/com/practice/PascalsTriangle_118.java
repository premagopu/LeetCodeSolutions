package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {

	// O(numRows^2) - time Complexity

	public static void main(String[] args) {

		generate(5);
	}

	public static List<List<Integer>> generate(int numRows) {
		int i = 1;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		while (i <= numRows) {
			List<Integer> row = new ArrayList<Integer>();
			if (i == 1) {
				row.add(1);
			} else {
				List<Integer> prev = result.get(i - 2);
				for (int j = 0; j < i; j++) {
					if (j == 0 || j == i - 1) {
						row.add(1);
					} else {
						row.add(prev.get(j) + prev.get(j - 1));
					}
				}

			}
			result.add(row);
			i++;
		}
		return result;
	}
}
