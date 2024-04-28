package packageA;

import org.openqa.selenium.remote.AdditionalHttpCommands;

public class ClassDEF {

	public static void main(String[] args) {
		//below line please uncomment and observe
		//addMethod(); //if want to call other class method into this class we need to create object for other class
	ClassABC classABC =new ClassABC();//created objecct and called form other class
	classABC.addMethod();
			
	}
	public void multification() {
		System.out.println("Multification");
	}

}
