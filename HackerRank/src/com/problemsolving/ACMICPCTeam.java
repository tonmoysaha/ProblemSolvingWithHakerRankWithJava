package com.problemsolving;

import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String[] string = new String[n];
		for (int i = 0; i < n; i++) {
			string[i] = scanner.next();
			if (string[i].length() > 5) {
				System.out.println("length not more than : " + m);
				break;
			}
		}

		scanner.close();
		int[] acmTeam = acmTeam(string);
		for (int i = 0; i < acmTeam.length; i++) {
			System.out.println(acmTeam[i]);
		}
	}

	static int[] acmTeam(String[] topic) {
		int team = 0, topics = 0;

		for (int i = 0; i < topic.length-1; i++) {
			for (int j = i+1; j < topic.length; j++) {
				int count = 0;
				for (int jj1 = 0; jj1 < topic[0].length(); jj1++) {
					if (topic[i].charAt(jj1) == '1' || topic[j].charAt(jj1) == '1' ) {
						count++;
					}
				}
				if (count > topics) {
					topics=count;
					team =1;
				}else if (topics == count) {
					team++;
				}
			}
			
		}
		int[] arr = { topics, team };
		return arr;

	}
}
//11101
//10101
//11001
//10111
//10000
//01110

//10101
//11100
//11010
//00101