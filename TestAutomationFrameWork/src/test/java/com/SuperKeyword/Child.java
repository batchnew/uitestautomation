package com.SuperKeyword;

public class Child extends Parent {
	
	
	String empName = "Umesh";
	int empNo =6547;
	
	public static void main(String[] args) {
		Child c = new Child();
		c.getData();
	}
	public void getData() {
		super.getData(); //super keyword will take get data from parent class (those having same method name as get data)


//		System.out.println(empName); //for example if we comment above superkeyword line an uncomment this two lines. it will print this class method get data
//		System.out.println(empNo);
		
		
		
		
//		System.out.println(super.empName);//if we use super it will take instance variable from parent class
//		System.out.println(super.empNo);
	}

}
