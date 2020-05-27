package com.java.thirtydayscode;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);

	}

}
class Difference{
	
	private int[] elements;
	int maximumDifference =0;

	public Difference(int[] data) {
		this.elements = data;
	}
	
	public void computeDifference() {
		int max = 0;
		for (int i = 0; i < elements.length; i++) {
			 if (max < elements[i]) {
				max = elements[i];
			}
		}
		for (int i = 0; i < elements.length; i++) {
			int value = elements[i]-max;
			int abs = Math.abs(value);

			if (abs > maximumDifference) {
				maximumDifference = abs;
			}
		}
		
	}
}
