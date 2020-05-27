package com.java.thirtydayscode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesandMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if (phoneBook.get(s) != null) {
				System.out.println(s + "=" + phoneBook.get(s));
			}else {
				System.out.println("Not found");
			}
		}
		in.close();

	}

}
