package com.first;//split

public class Twenty {
	
	public static void main(String[] args) {
		String s = "Amravati is in Maharashtra";
		String[] x = s.split(" ");
		
		for (int j = 0; j < x.length; j++) {
			System.out.println(x[j]);
		}
		
	}

}
