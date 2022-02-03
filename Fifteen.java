package com.first;

public class Fifteen {
	public static void main(String[] args) {
		String s = "NITIN";
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
