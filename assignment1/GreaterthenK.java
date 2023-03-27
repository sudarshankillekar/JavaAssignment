package com.assignment1;

public class GreaterthenK {
	

	    public static void main(String[] args) {
	        
	        String[] s = {"Apple", "bananana", "kiwi", "berry", "almond"};
	        int k = 5;
	        
	        for (String word : s) {
	            if (word.length() > k) {
	                System.out.println(word);
	            }
	        }
	        
	    }

	}



