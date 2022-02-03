package com.first;

public class Seventeen {
	public static void main(String[] args) {
		
		String s = "Hello";
		String t = new String ("Hello");
		String u = new String("Hello").intern();

		 
		System.out.println(s==t);	
		System.out.println(s==u);
		System.out.println(u==t);
		
		System.out.println(s.equals(t));
		System.out.println(t.equals(u));
		System.out.println(s.equals(u));
	}

}
