package testCase;

public class MethodsDemo {

	public static void main(String[] args) {
		  MethodsDemo md = new MethodsDemo();
		md.doLogin(); //if you want to call the methods in to main method we need to create a object for class, other wise its thrown an error
		md.doLogout();
		
		
		

	}
	public void doLogin()
	{//start
		
		System.out.println("login successfull");
		//login code
	}//end
	public void doLogout()
	{
		doLogin();
		//logout code	
		System.out.println("logout successfull");
	}
	public String name() {
		 
		
		return "umesh";
	}
	public void doENter() {
		
	}
	
}
