package com.problemsolving;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt(), positive = 0, negative = 0, zero = 0, temp = 0;
		int[] arr = new int[row];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.printf("%.6f\n", (double) positive / arr.length);
		System.out.printf("%.6f\n", (double) negative / arr.length);
		System.out.printf("%.6f\n", (double) zero / arr.length);

	}

}
