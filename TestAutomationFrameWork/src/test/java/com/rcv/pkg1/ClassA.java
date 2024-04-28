package com.rcv.pkg1;

public class ClassA {// in the class wont effect if we delete modifiers (public) for class,
	
	public int publicVariable=1;
	int defaultVariable=2;
	private int privateVariable=3;
	protected int protectedVariable=4;
	
	public static void main(String[] args) {
		ClassA classA  = new ClassA();
		classA.publicMethod();
		classA.privatedMethod();
		classA.defaultMethod();
		classA.protectedMethod();
		
	}
	
	
	public void publicMethod() {
		System.out.println("Public Method");
	}
	void defaultMethod() {
		System.out.println("Default Method");
	}
	private void privatedMethod() {//private will work with in only this class
		 	
	}
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}
	

}
