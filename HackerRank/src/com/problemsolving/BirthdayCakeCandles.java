package com.problemsolving;

import java.util.Scanner;

public class BirthdayCakeCandles {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		birthdayCakeCandles(arr);
	}

	static void birthdayCakeCandles(int[] arr) {
		int highestCandle =0, count=0, tall = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			int count =0;
//			for (int j = i; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//				}
//			}
//			if (highestCandle < count) {
//				highestCandle = count;
//			}
//			
//		}
//		System.out.println(highestCandle);
		for (int i = 0; i < arr.length; i++) {
			int height = arr[i];
			if (height > tall) {
				tall =height;
				count =1;
			}
			else if (height == tall) {
				count ++;
			}
		}
		System.out.println(count);

	}

}
