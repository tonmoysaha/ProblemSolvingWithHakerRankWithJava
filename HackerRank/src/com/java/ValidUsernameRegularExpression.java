package com.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidUsernameRegularExpression {

	 private static final Scanner scan = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int n = Integer.parseInt(scan.nextLine());
	        while (n-- != 0) {
	            String userName = scan.nextLine();

	            if (userName.matches(UsernameValidator.regularExpression)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }           
	        }
	    }

}
class UsernameValidator {
    /*
     * Write regular expression here.
     */
	static String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    public static String regularExpression = Pattern.compile(regex).toString();
}
