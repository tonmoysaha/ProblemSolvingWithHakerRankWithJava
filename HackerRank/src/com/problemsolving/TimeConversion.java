package com.problemsolving;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scanner.next();
		System.out.println(timeConversion(s));

	}
	static String timeConversion(String s) {
		SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date  date = null;
		try {
			  date = parseFormat.parse(s);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String time = dateFormat.format(date);
		return time;
       

    }

}
