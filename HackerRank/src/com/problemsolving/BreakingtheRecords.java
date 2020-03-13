package com.problemsolving;

import java.util.Scanner;

public class BreakingtheRecords {

	public static void main(String[] args) {

		int[] arr = { 3, 4 ,21, 36 ,10, 28 ,35, 5 ,24 ,42};
		int[] breakingRecords = breakingRecords(arr);

		for (int i : breakingRecords) {
			System.out.println(i);
		}
	}

	public static int[] breakingRecords(int[] scores) {
		int minscaore = 0, maxsceore = 0;
        int value = scores[0];
        int value2 = scores[0];
		for (int i = 0; i < scores.length; i++) {
			
			if (value < scores[i]) {
				value = scores[i];
				maxsceore++;
			}
			
			if (value2 > scores[i]) {
				value2 = scores[i];
				minscaore++;
			}
		}
		int[] record = { maxsceore, minscaore };
		return record;

	}

}

