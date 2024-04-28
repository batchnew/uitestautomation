package packageA;

public class ClassABC {

	public static void main(String[] args) {
		ClassABC classABC = new ClassABC();//if we create a class object only we will call the methods into main method,other wise we need to create static
			classABC.addMethod();	
			classABC.substraction();
	}	
	public void addMethod() {
			System.out.println("Plus");
			
		}
	public void substraction() {
			System.out.println("minus");
		}

	}

	

