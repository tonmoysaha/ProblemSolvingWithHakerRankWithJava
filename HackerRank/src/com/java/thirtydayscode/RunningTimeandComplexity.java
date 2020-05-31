package com.java.thirtydayscode;

import java.util.Scanner;

public class RunningTimeandComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int j = 1; j <= n; j++) {
			int value = in.nextInt(), count = 0;
			if (value ==1) {
				count =1;
			}
			for (int i = 2;  i <= (value/2); i++) {
				if (value % i == 0) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Not prime");
			} else {
				System.out.println("Prime");
			}

		}

	}

}

//if (value%temp != 0) {
//	System.out.println("Prime");
//	break;
//}else {
//	System.out.println("Not prime");
//	break;
//}
