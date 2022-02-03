package com.first;// String Palindrome

import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check for palindrome");
		String s = sc.next();
		
		String rev ="";
		for (int i = s.length()-1; i >=0 ; i--) {
			rev = rev+s.charAt(i);	
		}
		if(s.equals(rev)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		
	}

}

