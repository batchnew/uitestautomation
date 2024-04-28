package com.rcv.pkg2;

import com.rcv.pkg1.ClassA;

public class ClassB extends ClassA {//inheritance//extends a class(calling a method from one package class to other package class)
	//we need to do extends .ClassB is child, childA is Parent class,
	//then need to create object for ClassB(this class) and then call the class from other package class methods
	
	
	public static void main(String[] args) {
		
		ClassA classA =new ClassA();//if package change we need to import the class from other package
		classA.publicMethod(); //we do access only public method, public variable
		//We cant access private, int, protected when we extends Class A to Class B then only we can access the private and default, int
		 
		ClassB	classB = new ClassB(); //
		classB.protectedMethod();//this is the classA method (protected method)
		
		
		  
		
	}

}
