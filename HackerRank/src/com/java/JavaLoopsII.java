package com.java;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		int sum=0;
		for (int i = 0; i < q; i++) {
			int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt();
			
			for (int j = 0; j < n; j++) {
				sum+= (int) (a + b * Math.pow(2, j));
				System.out.print(sum + " ");
			}
			System.out.println();
		}

	}

}
