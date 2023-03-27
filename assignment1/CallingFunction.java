package com.assignment1;

//3. Write an example(code) of calling a function using class object.


public class CallingFunction {


			
           public void test() {
				System.out.println("Calling function through object ");
				
			}
			public static void main(String[] args) {
				
				CallingFunction cl = new CallingFunction();{
				cl.test();
			}
			
			
		}
	}

