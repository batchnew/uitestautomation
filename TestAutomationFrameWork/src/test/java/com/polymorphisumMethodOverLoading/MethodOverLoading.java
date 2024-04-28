package com.polymorphisumMethodOverLoading;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MethodOverLoading method = new MethodOverLoading();
    
    method.login(45654, "umesh");
    method.login("pamu", "umesh");
    method.login(85489,"umesh", 12345);
	}
	public void login(int i, String s) {
		System.out.println("Login successful using phoneNumber"
				+ " and password");	
	}
	public void login(String s, String p) {
		System.out.println("Login successful using user name and password");
	}
	
	public void login(int j, String p, int token) {
		System.out.println("Login successful using phoneNumber"
				+ " and password and tokenNumber");	
	}
	//method overloading means changing the arguments are parameters into particular method is called methodOverLoading.

}
