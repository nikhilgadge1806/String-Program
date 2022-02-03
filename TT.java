package com.first;

import java.util.Scanner;

public class TT {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String rev = new String(sb); 
		
		if(s.equals(rev)) {
			System.out.println("String is palidrome");
		}else {
			System.out.println("String is not palidrome");
		}
	}

}