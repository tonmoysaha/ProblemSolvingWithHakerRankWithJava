package com.java.thirtydayscode;
import java.util.Scanner;

public class BinaryNumbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		int n = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		scanner.close();
		int n=13;

		int count = 0;
		while (n > 0) {
			n = n & (n << 1);
			count++;
		}
		System.out.println(count);
	}

}
