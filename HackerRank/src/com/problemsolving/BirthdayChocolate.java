package com.problemsolving;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 13, m = 3;
		List<Integer> s = Arrays.asList(5 ,5 ,3, 2, 2, 2 ,
				1 ,2 ,5 ,3, 5 ,5 ,4 ,3, 3, 5);

		int birthday = birthday(s, d, m);
		System.out.println(birthday);
	}

	public static int birthday(List<Integer> s, int d, int m) {

		int sum = 0, length = 0, count = 0;
		if (s.size() > 1) {
			for (int i = 0; i < s.size(); i++) {

				if (m == length) {
					sum = 0;
					length = 0;
					i = i - (m - 1);
				}
				length++;
				sum += s.get(i);
				if (sum == d && length == m) {
					count++;
				}
				
			}
		} else {
			count++;
		}
		return count;
	}
}
