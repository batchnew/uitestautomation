package com.ThisKeyword;

public class ThisKeyWordForConstructor {
	
	int x;
	int y;
	String s;
	
	public ThisKeyWordForConstructor()
	{
	System.out.println("default");	
	}
	public ThisKeyWordForConstructor(int x , int y) { //parameter constructer
		this.x=x;//if you remove this and run you can observe this x value is not assigne with globla variable x
		this.y=y;//if you remove this and run you can observe this x value is not assigne with globla variable y
		System.out.println(x+y);
		System.out.println("default");
		
	}
	
	public void getData() {
		System.out.println(this.x+this.y);
	}
	
	public static void main(String[] args) {
		ThisKeyWordForConstructor tk = new ThisKeyWordForConstructor(5,9);
		tk.getData();
		
	}
	

}
