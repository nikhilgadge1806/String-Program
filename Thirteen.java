package com.first;

public class Thirteen {
	public static void main(String[] args) {
		
		String s = new String("Hello");
		s.concat("World");
		System.out.println("In case of String: "+s);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println("In case of StringBuffer: "+sb);
		
		
	} 

}
