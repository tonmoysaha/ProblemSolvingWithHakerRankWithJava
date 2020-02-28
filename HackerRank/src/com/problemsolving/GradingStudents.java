package com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] result = new Integer[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = scanner.nextInt();
		}
		List<Integer> list = Arrays.asList(result);
		List<Integer> gradingStudents = gradingStudents(list);
		for (Integer integer : gradingStudents) {
			System.out.println(integer);
		}

	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> passingResultList = new ArrayList<Integer>();

		for (Integer result : grades) {
			
			Integer div = result / 5;
			
			Integer roundvalue = 0;
			
			if (result >= 38 && (div * 5) < result) {
				div = div + 1;
				roundvalue = div * 5;
			}else {
				roundvalue = div*5;
			}

			if (roundvalue - result < 3 && result >=38) {
				passingResultList.add(roundvalue);
			}else {
				passingResultList.add(result);
			}

		}
		return passingResultList;

	}

}
