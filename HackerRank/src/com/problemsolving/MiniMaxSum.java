package com.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		long[] arr = new long[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		miniMaxSum(arr);
	}

	static void miniMaxSum(long[] arr) {
	   long sum = 0, min=arr[0],max =0, maxsum =0, minsum =0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		minsum = sum - max;
		maxsum = sum - min;
		System.out.println(minsum +" "+ maxsum);
	}
}
