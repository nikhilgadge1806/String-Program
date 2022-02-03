package com.first;//contains

import java.util.Scanner;

public class Eleven {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println("Enter a charachter to search in a String :");
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		System.out.println(s.contains(x));
			
	}

}
