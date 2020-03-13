package com.problemsolving;

import java.util.Scanner;
import java.util.Vector;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		Vector<Integer> a = new Vector<Integer>();
		Vector<Integer> b = new Vector<Integer>();
		
		for (int i = 0; i < m; i++) {
			int data = scanner.nextInt();
			a.add(data);
		}
		
		
		for (int i = 0; i < n; i++) {
			int data = scanner.nextInt();
			b.add(data);
		}
		
		System.out.println(getTotalX(a, b));
	}
	
	static int getTotalX(Vector<Integer> a, Vector<Integer> b) {
		Vector<Integer> divid= new Vector<Integer>();
		int count=0;
		for (Integer bb : b) {
			for (Integer aa : a) {
				if (bb%aa == 0) {
					Integer value= bb/aa;
					System.out.println(value);
                    divid.add(value);
				}
			}
			
		}
		return count;

	}

}
