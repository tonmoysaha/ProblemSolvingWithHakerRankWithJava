package com.java;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int length = A.length() + B.length();
        System.out.println(length);
        String check = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(check);
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "
        		+B.substring(0,1).toUpperCase()+B.substring(1));
	}

}
