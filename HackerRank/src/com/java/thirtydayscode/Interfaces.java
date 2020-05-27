package com.java.thirtydayscode;

import java.util.Scanner;

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator1();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);

	}

}

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator1 implements AdvancedArithmetic {
	
	
	public int divisorSum(int n) {
		int sum=0;
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				sum += i;
			}
		}
		return sum;
	}
}
