package com.interview;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int row = scan.nextInt();

		int[] array = new int[row];

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		int[] rotLeft = rotLeft(array, d);

		for (int i : rotLeft) {
			System.out.print(i + " ");
		}

	}

	static int[] rotLeft(int[] a, int d) {
		
		for (int i = 0; i < d; i++) {
			int data = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}

			a[a.length - 1] = data;
		}
		return a;
	}
}
