package com.java.thirtydayscode;

import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int Da = in.nextInt();
		int Ma = in.nextInt();
		int Ya = in.nextInt();
		
		int De = in.nextInt();
		int Me = in.nextInt();
		int Ye = in.nextInt();
		
		int fine=0;
		if (Ye<Ya) {
			fine=10000;
		} else if ( Me < Ma && Ye==Ya) {
			fine = 500 *(Ma-Me);
		}else if (De < Da && Me == Ma) {
			fine = 15 * (Da-De);
		}else if (De > Da) {
			fine = 0;
		}
		
		System.out.println(fine);

	}

}
