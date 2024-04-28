package testCase;

public class SingleDimentionalArrayDemo {
	
	public static void main(String[] args) {
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html  
		
		int myInt =10;//this is one type
	
		int[] myIntArray = new int[10]; //This is 2nd method"this is used with new keyword array
		myIntArray[0] =10;
		myIntArray[1] =20;//index intialization 
		myIntArray[2] =30;
		myIntArray[3] =40;
		myIntArray[4] =50;
		myIntArray[5] =60;
		myIntArray[6] =70;
		myIntArray[8] =80;
		myIntArray[9] =90;
		System.out.println(myIntArray[8]);
		System.out.println(myIntArray.length);
		
		int[] myIntArray1 = {10,20,30,40};//in this not used new keyword
		System.out.println(myIntArray1[3]); //this is 3type method
		System.out.println(myIntArray1.length);
	
	    //for string also it will work and remaing all data types we can user
		String[] myStringArray = new String[5];
	   //ex4
		//how to get values from array with for loop
		
		int[] myIntArray2 = {10,20,30,40,50};
		
		for (int i = 0; i < myIntArray2.length; i++)
		{
			System.out.println("**"+i);
			System.out.println(myIntArray2[i]);
		}
	}
}
