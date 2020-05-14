package com.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new JavaRegex().pattern));
		}

	}

}

class JavaRegex {
	String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
	String IP_REGEXP = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	public String pattern = Pattern.compile(IP_REGEXP).toString();
}
