package com.problemsolving;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6, k=3;
		
		 int[] ar = {1, 3, 2, 6, 1, 2};
		 divisibleSumPairs(n, k, ar);
	}
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i<j) {
					if ((ar[i]+ar[j])%k == 0) {
						count++;
					}
				}
			}
		}
		return count;
    }

}
