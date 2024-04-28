package com.inheritence.pkg1;

public class ChildClassOrSubClassTwoWheeler extends ParentClasOrBaseIsAutomobiles{
	
	

	public static void main(String[] args) {
	//** to acquire properties from base class to this subclass we will use extends keyword this called singleClass inheritance
	// without extends keyword we cannot get properties from base class
	
		ChildClassOrSubClassTwoWheeler motors = new ChildClassOrSubClassTwoWheeler();
		
		motors.TwoWheeler();
		motors.FourWheeler();
		
		motors.heroMoters();
		motors.bajajMoters();
				
	
	
	}
	public void heroMoters() {
		System.out.println("passionPLUS");
	}
	public void bajajMoters() {
		System.out.println("Pulser");
	}

}
