package com.constructer;

public class ConstructerExample {
	
	//No return type
	//Same name as the class name
	
	public ConstructerExample() {
		System.out.println("no argument constructer");
	}
	
	public ConstructerExample(int i) {
		System.out.println("Integar Constructer");
	}
	
	public ConstructerExample(int i, int y) {
		System.out.println("2 integar Constructer");
	}
	 
	public ConstructerExample(String s) {
		System.out.println("String  Constructer");
	}


	

	public static void main(String[] args) {
		
		 ConstructerExample ce = new ConstructerExample(); // if we uncoment and run it will print no argument constructer
		
		//ConstructerExample ce = new ConstructerExample(5); // if we uncoment and run it will print int argument constructer
		
		//ConstructerExample ce = new ConstructerExample(5,6); // if we uncoment and run it will print int argument, int argument constructer
		
		//ConstructerExample ce = new ConstructerExample("umesh"); // if we uncoment and run it will print String argument constructer

	}
	//******https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/WebDriver.html*****///
	

}
