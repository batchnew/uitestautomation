package testCase;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		//example 1 
		
		// loop with in loop is called nested loop, (for loop inside other for loop called as nested loop)
//		 for(int i=1; i<=4; i++)  {
//			int j=1;
//			while (j<=5){
//				System.out.println("value of i is "+i+"vlaue of j is"+j);
//				j++;
//			}
//		 }
   //to know how many times executed below example is available
		//ex 2
//		int count=0;//this count is used for no of times executed
//		 for(int k=1; k<=4; k++) 
//		 {
//			int r=1;
//			while(r<=5) 
//			{
//			System.out.println("value of k is "+k+"value of r is"+r);	
//			r++;
//			count++;//we need to add count incremental
//			}
//			
//		 }
//		 System.out.println("Final coutn "+count); //print final count, no of iteration done
//
//	}
	//loop with in loop, in that also loop
	
	 int count=0;//this count is used for no of times executed
	 for(int v=1; v<=4; v++) 
		 
	 {
		 System.out.println(v);
		int y=1;
		while(y<=5) 
		{
		System.out.println("value of k is"+v+"value of r is"+y);	
		
		
		for(int x=1;x<=2; x++)
		{
		System.out.println("value of y is"+y+"value of x is"+x);	
		count++;
		}
		y++;
		}
		
	 }
	 System.out.println("Final coutn "+count); //print final count, no of iteration done
}  
	
}
