package com.first;

public class Eighteen {
	public static void main(String[] args) {
		String t = new String ("Hello#?!");
		System.out.println(t.substring(5,7));
		System.out.println(t.replace("o", "Hi"));
		System.out.println(t.replaceFirst("#", "hi"));
		System.out.println(t.replaceAll("l", "hi"));
		
	}

}
