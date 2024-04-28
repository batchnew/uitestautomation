package testCase;

public class OperatorsInJava {
	
	
	public static void main(String[] args) {
		
		int myNumber =10;
		String str ="string demo"; //assiangment oeprator
	
		int  no1 =10;
		int  no2=20;
		System.out.println(no1+no2);  //arthamatic operator
		System.out.println(no1+str);
		
		int number = +10;
		int numbe1 =-10;  //unari operator
		
		int number3 = +10;
		int number4 =20; 
		number3++;   //incremental operator each time plus 1 wil be added
		System.out.println(number3);
		
		int number5=30;
		int number6=20;
		number5--;
		System.out.println(number5); //decreamental operator each time - 1 will be decreased.
		
	    boolean bool = true;
	    System.out.println(bool);
	    boolean bool2 = !true;
	    System.out.println(bool2);
		//Logical complement operator; inverts the value of a boolean
	
	    //equality relational operator (equal to)
	    int number7=30;
		int number8=30;
		if(number7==number8) 
		{
		System.out.println("Number are equals");		
		}
		else
		{
		System.out.println("Numbers are not equals");	
		}
		//not equalto
		if(number7!=number8) 
		{
		System.out.println("Number are equals");		
		}
		else
		{
		System.out.println("Numbers are not equals");	
		}
		//greater than equalto
		if(number>=number8) 
		{
		System.out.println("Number are equals");		
		}
		else
		{
		System.out.println("Numbers are not equals");	
		}
		//conditional operator(conditional And operator)
		int myno4=30;
		int myno5=40;
		if((myno4 == 30)&& (myno5==40)){
			System.out.println("This is conditional and operator");
		}
		else 
		{
		System.out.println("this is not a conditionlal and operator");	
		}
		//(conditional or operator)
		int myno7=30;
		int myno8=40;
		if((myno7 == 30)|| (myno8==50)){
			System.out.println("This is conditional or operator");
		}
		else 
		{
		System.out.println("this is not a conditionlal or operator");	
		}
	
	}

}
