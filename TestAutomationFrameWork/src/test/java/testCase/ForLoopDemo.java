package testCase;

public class ForLoopDemo {
	
	public static void main(String[] args) {
		 /* syntax
		  * for(initilization; condition ; updation)
		  * {
		  * 
		  * }
		  *  
		  */
		//ex1--initalisation with in the code
		for (int i=1; i<=10; i++) 
		{
			System.out.println(i);
		}
		
		//ex2--intialisation out side the code
		int i=1;
		for(; i<=10; i++) {
		System.out.println(i);
		}
		
		//ex3--intialisation out side the code  //this is not correct no one execute
		int j=1;
		for(; j<=10;)
			System.out.println(j);
		 j++;	
		 
		//uses of different loops
			
//	while loop --dont know the no of iterations
//	do while loop -dont know the number of iterations -want to execute the code at least once irrespective of what ever condition is.
//	for loop--we know no of iteration we need to iterations.(how many iterations you want to run
			 
}
	
}



