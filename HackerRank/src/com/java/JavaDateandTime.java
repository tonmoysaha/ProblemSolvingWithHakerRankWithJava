package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaDateandTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();
		System.out.println(getDay(month, day, year)); 
		

	}
	public static String getDay(int month, int day, int year)  {
		String date = String.format("%d %d %d", month, day, year);
		SimpleDateFormat format = new SimpleDateFormat("MM dd yyyy");
		Date date2 = null;
		try {
			date2 = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat f = new SimpleDateFormat("EEEE");
		String day1 = f.format(date2);
		return day1.toUpperCase();
		
	}
}
