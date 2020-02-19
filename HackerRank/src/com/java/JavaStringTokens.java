package com.java;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s =s.trim();
        if (s.length() == 0) {
			System.out.println(0);
			return;
		}else if (s.length() > 400000) {
			return;
		}
       
        String deliminitor =  "[ !,?._'@]+";
        String[] spilt =  s.split(deliminitor);
        System.out.println(spilt.length);
        for (String string : spilt) {
            System.out.println(string);
        }

    }

}