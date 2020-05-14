package com.problemsolving;

import java.util.Collections;
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
			a.add(scanner.nextInt());
		}
		
		
		for (int i = 0; i < n; i++) {
			b.add(scanner.nextInt());
		}
		
		System.out.println(getTotalX(a, b));
	}
	
	public static int getTotalX(Vector<Integer> a, Vector<Integer> b) {
	    Collections.sort(a);
	    Collections.sort(b);
	    int maxA = a.get(a.size()-1);
	    int minB = b.get(0);
	    int totalX = 0;
	    int currentVal = maxA;
	    while(currentVal <= minB) {
	        final int current = currentVal; 

	        if(a.stream().allMatch(e->current % e == 0 || e % current == 0) &&
	            b.stream().allMatch(e->current % e == 0 || e % current == 0)) {
	                totalX++;
	        }

	        currentVal += maxA;
	    }
	    return totalX;
	}


}
//2 3
//2 4
//16 32 96
