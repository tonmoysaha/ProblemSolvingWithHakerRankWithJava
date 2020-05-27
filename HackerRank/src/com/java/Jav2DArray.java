package com.java;

import java.util.Scanner;

public class Jav2DArray {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 6; j++) {
					arr[i][j] = scanner.nextInt();
				}
	        }

	        scanner.close();
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < arr.length-2; i++) {
				for (int j = 0; j < arr.length-2; j++) {
					
					int sum = (arr[i][j]+ arr[i][j+1]+arr[i][j+2])
							+(arr[i+1][j+1])+(arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
					
					if (max < sum) {
						max =sum;
					}
					
				}
			}
	        System.out.println(max);
	    }

}
