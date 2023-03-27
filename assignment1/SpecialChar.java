package com.assignment1;

public class SpecialChar {

	    public static void main(String[] args) {
	        
	        String str = "98@sudarshan90";
	        
	        boolean containsSpecialChar = checkSpecialChar(str);
	        if (containsSpecialChar) {
	            System.out.println("The string contains special character(s).");
	        } else {
	            System.out.println("The string does not contain any special character.");
	        }
	        
	    }
	    
	    public static boolean checkSpecialChar(String str) {
	        String specialChars = "[!@#$%^&*()_+=\\[\\]{};':\"\\\\|,.<>\\/?]";
	        return str.matches(".*" + specialChars + ".*");
	    }

	}

