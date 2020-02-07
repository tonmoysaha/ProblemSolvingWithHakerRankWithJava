package com.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class ComparetheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(17);
		a.add(28);
		a.add(30);

		b.add(99);
		b.add(90);
		b.add(8);

		System.out.println(compareTriplets(a, b));

	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int al = 0, bo = 0;
		for (int i = 0; i < a.size(); i++) {

			if (a.get(i) > b.get(i)) {
				al++;

			}
			if (a.get(i) == b.get(i)) {
				continue;
			}

			if (a.get(i) < b.get(i)) {
				bo++;
			}
		}
		a.clear();
		a.add(al);
		a.add(bo);
		return a;

	}

}
