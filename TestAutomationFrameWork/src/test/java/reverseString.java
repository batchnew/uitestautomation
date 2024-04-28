import java.util.Iterator;

public class reverseString {

	public static void main(String[] args) {
		
		//1 Type -ahsraH olleH
		
//		String original ="Hello Harsha";
//		StringBuilder reversed =new StringBuilder(original).reverse();
//		String result =reversed.toString();
//		System.out.println(result);
		
		//2 Type -ahsraH olleH
		
//		String original ="Hello Harsha";
//		String reversed ="";
//		
//
//		for (int i =original.length()-1; i>=0; i--) {
//			reversed +=original.charAt(i);
//		}
//		System.out.println(reversed);
		
		//3 Type (ONLY word reverse) -World Hello
		
//		String original1 = "Hellow World";
//		String[] words =original1.split(" "); //split the string into words
//		String reverse= words[1] +" " +words[0]; 
//		System.out.println(reverse);
		
		//4 Type
		
		String sentence ="While I am going to a movie I saw my friend eating some snacks on road side";
		    //split the sentences into the words
		String[] words1= sentence.split(" ");
		
		//reverse the order of words
		StringBuilder reversedSentences = new StringBuilder();
		for (int i=words1.length -1; i>=0; i--) {
			reversedSentences.append(words1[i]);
			if(i>0) {
				reversedSentences.append(" ");	
			}
			System.out.println(reversedSentences.toString());
		}
		
		
		

}
}
