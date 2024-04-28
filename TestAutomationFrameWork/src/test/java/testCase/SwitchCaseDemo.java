package testCase;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		/*//if expression evaluted its go to   case 1 if satisify statement will execute if not another case2
		 * swith(expriession){
		 * case 1:
		 *    statements
		 * case 2:
		 *    statements
		 * 
		 * default:     //if non of cases are saticified it will goes to default statement.
		 *     statements
		 * 
		 */
		int day =2;
		switch(day)
		{
		case 1:
			System.out.println("Monday");
		case 2:
			System.out.println("Tuesday");
		case 3:
			System.out.println("Wednesday");
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
		case 6:
			System.out.println("Saturday");
			default:
				System.out.println("None of the cases saticified");
				//for the above if the case saticified also after that all cases got print without break
		}
		
		
		
		//similarly with breaks if the condition got satisified it won't execute other 
		  
		int day1 =2;
		switch(day1)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("None of the cases saticified");
		}
		  
	
		
		//if non of cases saticified after using break it will also move to default
		  
				int day3 =10;
				switch(day3)
				{
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
					default:
						System.out.println("None of the cases saticified");
				}
	}	 
	}
	
	
	

