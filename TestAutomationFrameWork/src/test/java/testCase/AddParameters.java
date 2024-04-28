package testCase;

public class AddParameters {
	static int x =10;
    static int y=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(x+y); 
      AddParameters md =new AddParameters();
      md.addNumbers1(15, 15);
      md.diffParameters("umesh", 10, 23);
	}
	
	public int addNumbers(int x, int y) {
		// int z=x+y;
		return x+y;
	}
	public void addNumbers1(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	public void diffParameters(String s, int i, float f) {
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
	}
}


