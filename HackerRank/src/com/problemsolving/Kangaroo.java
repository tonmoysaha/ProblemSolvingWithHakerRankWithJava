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
        int sum1 =0, sum2 =0;
		for (int i = x1; i < 13; i+=v1) {
			 sum1 = v1 + i;
		}
		for (int i = x2; i < 13; i+=v2) {
			 sum2 = v1 + i;
		}
		if (sum1 == sum2) {
			return "YES";
		}
		return "NO";

    }

}
