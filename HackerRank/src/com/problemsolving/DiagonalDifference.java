package com.problemsolving;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int[][] array = new int[row][row];
		int sum2 = 0, sum1 = 0, length = array.length;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < array.length; i++) {
			sum1 += array[i][i];
			sum2 += array[length-1-i][i];
		}
		
		System.out.println(Math.abs(sum1-sum2));

	}

}
