package com.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
//		List<BigDecimal> bigDecimals = new ArrayList<BigDecimal>();
//		for (int i = 0; i < s.length - 2; i++) {
//			BigDecimal b = new BigDecimal(s[i]);
//			bigDecimals.add(b);
//		}
//		
//		Collections.sort(bigDecimals, Collections.reverseOrder());
//
		
//		for (int i = 0; i < bigDecimals.size(); i++) {
//				s[i] = bigDecimals.get(i).toString();
//		}

		Comparator<String> customcomparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				BigDecimal b1 = new BigDecimal(o1);
				BigDecimal b2 = new BigDecimal(o2);
				return b2.compareTo(b1);
			}
		};

		Arrays.sort(s, 0, n, customcomparator);
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
