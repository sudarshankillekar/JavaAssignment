package com.assignment1;

//1. Write an example(code) to show method is overridden?
//2. Wrtire an example(code) to inherit one class property from another class.

class Animal {
	   public void makeSound() {
	      System.out.println("The animal makes a sound");
	   }
	}

	class Dog extends Animal { //example of inheritance
	   @Override //Example of method override
	   public void makeSound() {
	      System.out.println("The dog barks");
	   }
	

	
	   public static void main(String[] args) {
	      Animal myAnimal = new Animal(); 
	      Animal myDog = new Dog();  
	      
	      myAnimal.makeSound(); 
	      myDog.makeSound();    
	   }
	   }
