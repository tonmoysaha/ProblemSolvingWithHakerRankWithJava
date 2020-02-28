package com.problemsolving;

import java.util.Scanner;

public class AppleandOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int t = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int ad = scanner.nextInt();
		int od = scanner.nextInt();
		int[] apples = new int[ad];
		int[] oranges = new int[od];

		for (int i = 0; i < apples.length; i++) {
			apples[i] = scanner.nextInt();
		}
		for (int i = 0; i < oranges.length; i++) {
			oranges[i] = scanner.nextInt();
		}

		countApplesAndOranges(s, t, a, b, apples, oranges);
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int countApple = 0, countOrange = 0;
		
		for (int i = 0; i < apples.length; i++) {
			int sum = a+ apples[i];
			if (sum >= s && sum <= t) {
				countApple++;
			}
		}
		
		for (int i = 0; i < oranges.length; i++) {
			int sum = b+ oranges[i];
			if (sum >= s && sum <= t) {
				countOrange++;
			}
		}
		
		System.out.println(countApple);
		System.out.println(countOrange);
		
	}

}
