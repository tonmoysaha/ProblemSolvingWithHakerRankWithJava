package com.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class JavaDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int max = 0;

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.push(num);
		}
		for (int i = 0; i < deque.size(); i++) {
			

			for (int j = i; j < m - 1; j++) {
					
			}

		}

		System.out.println(max);

	}

}
//if (deque.contains(j) != deque.contains(j+1)) {
//count++;
//if (max < count) {
//	max =count;
//}
//}