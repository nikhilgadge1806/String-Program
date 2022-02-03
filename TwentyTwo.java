package com.first;// No of palidromes in a string

public class TwentyTwo {
	
	public static void main(String[] args) {
		String s ="Nitin is studying iti in fitter. He can then design racecar level 1";
		System.out.println(s);
		 String[] p = s.split(" ");
		 String rev="";
		 int count = 0;
		 for(String q : p) {
		 for(int i = q.length()-1; i>=0; i-- ) {
			 rev = rev + q.charAt(i);
		 }
		 rev = rev +" ";
		 }
		 System.out.println(rev);
		 
		 String[] r = rev.split(" ");
		 for(int i = 0; i< p.length; i++) {
			 for(int j = 0; j< r.length;j++) {
				 if(p[i].equals(r[j])) {
				 count++;
				 }
			 }
		 }
	 System.out.println("No of Palindromes are "+count);
	}
	
}