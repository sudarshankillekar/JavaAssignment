package com.assignment1;

public class PrintindexwithH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "hi good morning, how are you, We are here to celibrate holi, plz come home";
	        String[] words = s.split(" "); 
	        for (String word : words) {
	            if (word.startsWith("h")) { 
	                System.out.println(word);
         }
	  }
	}
}
