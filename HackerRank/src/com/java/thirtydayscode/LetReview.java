package com.java.thirtydayscode;
import java.util.Scanner;

public class LetReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();

		String[] array = new String[row];

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.next();
		}
		for (int i = 0; i < array.length; i++) {
			String even = "",odd = "";
			String value = array[i];
			for (int j = 0; j < value.length(); j++) {
				if (j%2 == 0) {
					even += value.charAt(j);
				}else {
					odd += value.charAt(j);
				}
			}
			System.out.println(even+" "+odd);
		}
		
	}

}
