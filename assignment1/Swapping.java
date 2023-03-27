package com.assignment1;

public class Swapping {

	public static void main(String[] args) {
		// 4. Write a Java program to swap two variables without temp variable?
		
		int a = 100;
		int b = 50;

		System.out.println("Befor swaping value of a is "+ a + " & value of b is "+ b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		System.out.println("After swaping value of a is "+ a + " & value of b is "+ b);
		
		

	}

}
