package com.polymorphisumMethodOverRiding;



public class Fish extends Animal {

	public static void main(String[] args) {
	
		Fish f= new Fish();
		f.fishSwim("fish can swim in ocean");//this method over riding with parameters. extends from animal class
	}	
		@Override
		public void fishSwim(String s) {
			System.out.println(s);
		}
		
	}


