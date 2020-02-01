package com.java;

import java.util.Scanner;

public class JavaEndoffile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new   Scanner(System.in);
		int a=0;
		while (scan.hasNext()) {
			String value = scan.nextLine();
			if (value.isEmpty()) {
				break;
			}
			System.out.printf("%d %s\n",++a,value);
		}

	}

}
