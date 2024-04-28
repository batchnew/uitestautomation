package com.rcv.pkg1;

public class ClassAA extends ClassA {//If you want extends other wise it will work on same package
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.defaultMethod();
		
		ClassAA classAA = new ClassAA();
		classAA.defaultMethod();	
	} 
	public void methodAA() {
		System.out.println("Method AA");
	}

}
