package com.ThisKeyword;

public class ThisKeywordDemo {
	
	int x=10;
	int y=20;
	String s="umesh";

	public static void main(String[] args) {
		ThisKeywordDemo tk = new ThisKeywordDemo();
		tk.getData();
	}
//	public void getData() { //1
//		System.out.println(x+y); //it will print global variable
//	}
	
//	public void getData() { //2
//		
//		int a =50;
//		int b=40;
//		System.out.println(a+b );//it will print local variable
//	}
//	public void getData() { //3
//		
//		int x =50;
//		int y=40;
//		System.out.println(x+y ); //this for global variables but print local variable values only
//		System.out.println(x+y );//this for loacl variable but when will we run it will print only this method loacla variables only
//		                           //it will print local variable
//	}
	public void getData() { //3
		
		int x =50;
		int y=40;
		System.out.println(this.x+this.y ); //this key word refer for global variables. it will print the global variable values
		System.out.println(x+y );//this for loacl variable but when will we run it will print only this method loacla variables only
		                           //it will print local variable
	}
	
	

}
