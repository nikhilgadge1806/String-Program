package com.first;// check if specified character is present in the string

import java.util.Scanner;

public class Ninteen {
	public static void main(String[] args) {
		String s = "Hello";
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter a character to search in a string");
		String x = sc.next();
		
		System.out.println(s.contains(x));
		
	}

}

