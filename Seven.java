package com.first;//another

public class Seven {
public static void main(String[] args) {
	
	String v = "Hello";
	String t = new String("Hello").intern();
	if(v==t) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}