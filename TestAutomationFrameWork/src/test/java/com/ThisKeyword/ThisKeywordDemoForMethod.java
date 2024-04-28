package com.ThisKeyword;

public class ThisKeywordDemoForMethod {
	
	int x=10; //global variable
	int y=20; //global variable
	String s="umesh"; //global variable

	public static void main(String[] args) {
		ThisKeywordDemoForMethod tk1 = new ThisKeywordDemoForMethod();
		tk1.getData();
		// TODO Auto-generated method stub

	}
	public void getData() { //3
		
		int x =50; //local variable
		int y=40; //local variable
		System.out.println(this.x+this.y ); //this key word refer for global variables. it will print the global variable values
		System.out.println(x+y );//this for loacl variable but when will we run it will print only this method loacla variables only
		                           //it will print local variable
		
		this.getData1(); //when we call one method to another method (getData1 to getdata ) we will use this.method name (this.getData1)
		                  // if we not provide this it will will take automatically.(getData1();)
	}
	public void getData1() { //3
		
		int x =100; //local variable
		int y=100; //local variable
		System.out.println(this.x+this.y ); //this key word refer for global variables. it will print the global variable values
		System.out.println(x+y );//this for loacl variable but when will we run it will print only this method loacla variables only
		                           //it will print local variable
	}

}
