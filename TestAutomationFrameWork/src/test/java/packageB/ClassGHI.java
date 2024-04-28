package packageB;

import packageA.ClassABC;

public class ClassGHI {
	
	
	public static void main(String[] args) {
		//addMethod();//if we want to call other package class methdo we need to import.ClassABC(packageA)
		ClassABC classABC = new ClassABC();//import packageA.ClassABC;
		classABC.substraction();
		
		ClassGHI classGHI =new ClassGHI();
		classGHI.pecentage();
	}
	public void pecentage() {
		System.out.println("percentage");
		ClassABC classABC = new ClassABC();//import packageA.ClassABC;
		classABC.addMethod();
	}

}
