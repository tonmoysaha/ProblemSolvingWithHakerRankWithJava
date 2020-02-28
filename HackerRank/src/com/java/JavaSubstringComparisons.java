package com.java;
import java.util.Scanner;

public class JavaSubstringComparisons {
	public static String getSmallestAndLargest(String s, int k) {

		String smallest = s.substring(0,k);
		String largest = "";
		int m = k;
		String[] values = new String[s.length() - (m - 1)];
		for (int i = 0; i < s.length() - (m - 1); i++) {
			values[i] = s.substring(i, k + i).toString();
		}

		for (int i = 0; i < values.length; i++) {

			if (smallest.compareTo(values[i]) > 0) {
				smallest = values[i];
			}

			if (largest.compareTo(values[i]) < 0) {

				largest = values[i];
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}