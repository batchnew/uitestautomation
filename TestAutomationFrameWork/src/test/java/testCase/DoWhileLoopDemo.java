package testCase;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
	// in do while loop 
		//execute code inside loop first --> then after check condition -->true --->code insideloop
		//                                                                -->false-->Endloop
		/*
		 * syntax
		 * do{
		 *   statement(s)
		 * 
		 *   }while(condition);
		 * 
		 */
		//ex--1
//		int i=1;
//		do {
//			System.out.println(i);
//		}while(i<10);
//	
	//ex2
	int k=1;
	do {
		System.out.println(k);
		k++;
	}while(k<10);
	
	//ex3: diff between while llop and do whileloop
	  //ans in do while loop the code will execute first and then after it will chech the while condition. if the condition is true then it again it will execute code
	   //   in while loop firstly it check condition, if condition is true then only it will execute code,  
	int j=1;
	do {
		System.out.println(j);
		j++;
	}while(k>10);
	System.out.println("outside do while loop");
	
	
	while(k>10)
	{
		System.out.println(j);
	}
	System.out.println("out side while loop");
	
}

}
