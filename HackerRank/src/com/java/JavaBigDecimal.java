package com.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		List<BigDecimal> bigDecimals = new ArrayList<BigDecimal>();
//		int n =  scanner.nextInt();
//		while (n != 0) {
//			String value = scanner.next();
//			bigDecimals.add(new BigDecimal(value));
//			n--;
//		}
//		Collections.sort(bigDecimals, Collections.reverseOrder());
//		
//		for (BigDecimal bigDecimal : bigDecimals) {
//			System.out.println(bigDecimal);
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		List<BigDecimal> bigDecimals = new ArrayList<BigDecimal>();
		for (int i = 0; i < s.length - 2; i++) {
			bigDecimals.add(new BigDecimal(s[i]));
		}
		
		Collections.sort(bigDecimals, Collections.reverseOrder());

		for (int i = 0; i < bigDecimals.size(); i++) {
				s[i] = bigDecimals.get(i).toString();
		}
		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
