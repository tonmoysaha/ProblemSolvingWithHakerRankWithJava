package com.problemsolving;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int v1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int v2 = scanner.nextInt();

		System.out.println(kangaroo(x1, v1, x2, v2));
	}

	static String kangaroo(int x1, int v1, int x2, int v2) {

		int k1 = x1, k2 =x2;
		if (x2 > x1 && v2 > v1) {
			return "NO";
		}
		for (int i = 0; i < 10000; i++) {

			k1 += v1;
			k2 += v2;
			if (k1 == k2) {
				return "YES";
			}
			
		}
		return "NO";
	}

}
