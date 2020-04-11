package com.practice;

public class FlippingAnImage_832 {

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		flipAndInvertImage(a);
	}

	public static int[][] flipAndInvertImage(int[][] A) {
		int[][] result = new int[A[0].length][A.length];
		int a = 0;
		for (int i = 0; i < A.length; i++) {
			int b = 0;
			for (int j = A[0].length - 1; j >= 0; j--) {
				result[a][b] = A[i][j] == 0 ? 1 : 0;
				b++;
			}
			a++;
		}

		return result;
	}
}
