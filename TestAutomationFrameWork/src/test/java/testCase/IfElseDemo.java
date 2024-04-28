package testCase;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=10;
		
//   if(expression)
//	}
//	{
	//1st
		if(num1>num2) {
			System.out.println("Number 1 is greater than number greater than 2");
		}
	//2nd (with one condition and else)
	if(num1>num2) {
		System.out.println("Number 1 is greater than number greater than 2");
	}
	else
	{
    System.out.println("Number 1 is not greater than number greater than 2");	
		
	}

	//3rd(with 2 conditions
	if(num1>num2) {
		System.out.println("Number 1 is greater than number greater than 2");
	}
	else if(num1 == num2)
	{
    System.out.println("Number 1 is equal to 2");	
		
	}
	
	//4rd(with mulitiple conditions
		if(num1>num2) {
			System.out.println("Number 1 is greater than num 2");
		}
		else if(num1 == num2)
		{
	    System.out.println("Number 1 is equal to 2");	
			
		}
		else if(num1<num2) 
		{
		System.out.println("Number 1 is less than num2");	
		}
		else  //else means if elseif conditions all got failed finally it will come to else block
		{
			
		System.out.println("In the final else block");	
		}
			
	

	//below nested if else condition(inside the if condition there will be write another condition) 
        int hi1 =40;
        int hi2 =20;
        int hi3 =30;
        
			//1st
		 if(hi1>hi2)    //condintion   
			{
			System.out.println("hi 1 is greater than number greater hi 2");
			}
			if(hi2<hi3) //condition with in condition excuted 
			{
			System.out.println("with the nested if else");	//this called block
			}
			else
			{
				System.out.println("In the nested else block");
			}
}
}


