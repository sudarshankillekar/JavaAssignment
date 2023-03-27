package com.assignment1;

import java.util.Arrays;

public class SplitandJoin {

	public class SplitJoinExample {
	    public static void main(String[] args) {
	        String sampleString = "Hi How are you doing ";
	        String[] words = sampleString.split(" ");
	        String joinedString = String.join(" ", words);
	   
	        System.out.println("Splited " + Arrays.toString(words));
	        System.out.println("Joined" + joinedString);
	    }
	}

}
