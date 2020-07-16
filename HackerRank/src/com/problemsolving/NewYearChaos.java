package com.problemsolving;

import java.util.Scanner;

public class NewYearChaos {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int t = scanner.nextInt();

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();

			int[] q = new int[n];

			for (int i = 0; i < n; i++) {
				int qItem = i;
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}

	static void minimumBribes(int[] q) {

	}
}
