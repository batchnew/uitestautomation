package testCase;

public class BreakAndContinueDemo {

	public static void main(String[] args)
	{
		//ex: - this loop will continue upto match 10
//		for (int i=1; i<=10; i++)
//		{	
//		System.out.println(i);		
//		}
		
		//***************break*******************//
		
		//ex2: if ther is a condition if loop is match 7 then i want to break condition
		
//	   for (int j=1; j<=10; j++)//this 10 loop
//	   {
//		 if(j==7) //if loop match 7 the loop will break
//		 {
//			break; 
//		 }
//		System.out.println(j);	 
//	   }
//	   System.out.println("Final statement");	
	   
	   
	 //ex3: with mutliple conditions
		
//	   for (int k=1; k<=10; k++)//this 10 loop
//	   {
//		 if(k==7 || k==5) //if loop match 7 the loop will break
//		 {
//			break; 
//		 }
//		System.out.println(k);	 
//	   }
//	   System.out.println("Final statement");
	   
	   //*********continous**********//
	   
	   for (int l=1; l<=10; l++)
	   {
		 if(l==7) 
		 {
			continue;//continue loop will skip matched value statement remaining will continue with same.(for example in test data if we want to skip some row of data it will useful. 
		 }
		System.out.println(l);	 
	   }
	   System.out.println("Final statement");
	
	   //
	   //differ between break and jump
	   //1. break will jump in loop as soon as the condition as met.
	}

}
