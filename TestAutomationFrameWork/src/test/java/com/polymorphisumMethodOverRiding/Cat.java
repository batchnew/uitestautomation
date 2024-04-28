package com.polymorphisumMethodOverRiding;

public class Cat extends Animal{

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.makeNoise();
		

	}
	public void makeNoise() { // make noise parameter taken form animal parent class
		System.out.println("Cat meows");	
	}

}
//
