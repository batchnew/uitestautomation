package testCase;

public class WhileLoopDemo {
	
	
	public static void main(String[] args) {
		//while loop
		//condition ---->true--->code inside while loop -->condition
	   //           ---->False--->End of loop
		//Syntax   
		/*
		 * while(condition)
		 * {
		 *  statement(s)
		 * }
		 * 
		 */
		//ex--1
		int i =1;
		while(i<=10) 
		{
		System.out.println(i);	//this will print again and again 1 because the loop will said util run equal to run
		}
		
		
		//Simlarry ex:2
		int k =1;
		while(k<=10) 
		{
		System.out.println(k);	
		k++;
		//in this we added incremental method once it got satified the loop will saticified
		//mean 1+1=2, 2+1=3, 3+1=4 util 9+1 =10 if 10 is saticified it will stop
		}
		
		//ex:3  if condition is false it will not enter into loop , it willl not print anything
		int j =1;
		while(j>10)  //false
		{
			System.out.println(j); //it will not come into this block because it is false
			j++;
		}
		System.out.println("after the while loop");
		
		
		
		//ex:4 //if the condition got saticified it will come to util true, and then after came out the loop and enter into fale loop and end the loop
		int p =1;
		while(p<=10)  //false
		{
			System.out.println(p); //it will not come into this block because it is false
			p++;
		}
		System.out.println("after the while loop");
	}
	}
	
	
	


