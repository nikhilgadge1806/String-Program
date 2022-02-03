package com.first;

public class Fourteen {
	public static void main(String[] args) {
		
		String s = new String("Hello");
		s.concat("World");
		System.out.println("In case of String: "+s);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		sb.reverse();
		System.out.println("In case of StringBuffer: "+sb);
		
		
	} 

}
