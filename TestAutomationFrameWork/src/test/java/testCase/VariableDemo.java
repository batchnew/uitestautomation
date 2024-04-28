package testCase;

public class VariableDemo {
	
	int j =20;//1.instance variable 
	// if we define a varible in a class it will be called as instance varible, it will used to entire class and in class all methods.
	//give varible name must which are local understand (marks,students)
	public static void main(String[] args) {
		
		//datatype variablename = value;
		int mynumber =10;
		int secondNumber =20;
		char ch ='A';
		String str1 ="RCV"; 
		//contactinat to variables below
		System.out.println(mynumber+str1);
		System.out.println(mynumber+" "+str1);//if you want space between two variables you can mention semicolon
		System.out.println(mynumber+secondNumber);
	}
	//below if we define a variable in method called as local variable
	public void mymethod () {
		int i=20;//2.local variable
		
		//3.static variable will cover later.
	}
	

}
