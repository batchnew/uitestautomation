package testCase;

public class StringLitraralVsObject {
	
	public static void main(String[] args) throws InterruptedException {
		String str1="Umesh";
		String str2= new String("Umesh"); 
		String str3="U;mesh";
		System.out.println(str1==str2); //this will return false
		
		System.out.println(str1.equals(str2));  //this will return true 
		System.out.println(str1==str3); 
	}
}
