package com.first;

public class Five {
	public static void main(String[] args) {
		String  s = "Hello World";// find how many vowels in the string
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)== 'a' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || 
					s.charAt(i)== 'u' ) {
				count++;
			}
			}
		System.out.println("There are "+count+" vowels in s string: "+s);
		}
		
	}


