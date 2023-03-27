package com.assignment1;

public class ReverseString {
	
//	7. Write a program to reverse an string using for and while loop.
	public static void main(String[] args) {
		
		String name = "sudarshan";
		String reveresedname = "";
		char ch;
		
		for (int i = 0; i<name.length();i++) {
			ch = name.charAt(i);
			reveresedname = ch+reveresedname;
		}
		
		System.out.println(reveresedname);	    
	}

}
