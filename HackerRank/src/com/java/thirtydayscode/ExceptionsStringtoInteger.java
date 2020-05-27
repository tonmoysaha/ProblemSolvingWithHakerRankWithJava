package com.java.thirtydayscode;
import java.util.Scanner;

public class ExceptionsStringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String S = in.next();
		try {
				int parseInt = Integer.parseInt(S);
				System.out.println(parseInt);
		} catch (Exception e) {
			System.out.println("Bad String");
		}

	}

}
