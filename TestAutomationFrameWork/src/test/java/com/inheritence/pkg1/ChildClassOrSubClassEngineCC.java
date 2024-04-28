package com.inheritence.pkg1;

public class ChildClassOrSubClassEngineCC extends ChildClassOrSubClassTwoWheeler{

	public static void main(String[] args) {
		
		//**two get properties from base class and child class to other child class class is called multiple Inheritance
		// we will use extends keyword\
		
		
		ChildClassOrSubClassEngineCC  cc = new ChildClassOrSubClassEngineCC();
		
		
		cc.TwoWheeler();
		cc.FourWheeler();
		
		
		cc.bajajMoters();
		cc.heroMoters();
		
		cc.hundredCCvehicles();
		cc.twoHundredCCvehicles();
		
		cc.name();
		cc.abcd();
		
		
	}
	public void hundredCCvehicles() {
		System.out.println("100cc");
	}
	public void twoHundredCCvehicles() {
		System.out.println("200cc");
	}
	public void name() {
		System.out.println("Harsha"+" Ananya");
	}
	public void abcd() {
		System.out.println("ABCDEF");
	}
	

}
