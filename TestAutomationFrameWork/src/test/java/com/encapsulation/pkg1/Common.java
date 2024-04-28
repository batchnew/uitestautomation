package com.encapsulation.pkg1;

public class Common {

	
		
//		public int length;
//		public int width;
//		public   int height;
	
		private int length;//if i change public to private it will impact on create box class
		private int width;
		private int height;
		 //ex =1
//		public void setBoxDimension(int l, int b, int h) {
//			System.out.println("Box Created with dimensions "+l+ " "+b+" "+h+" ");
//		}
		 
//		//Setter method
//		public int setLength(int l)
//		{
//			length=l;
//			return length;	
//		}
//		public int setWidth(int w)
//		{
//			width=w;
//			return width;	
//		}
//		public int setHeight(int h)
//		{ 
//			height=h;
//			return height;	
//		}
//		//GETTER method
//		public int getLength()
//		{
//			return length;	
//		}
//		public int getHeight()
//		{
//			return height;
//		}
//		public int getWidth(  )
//		{
//			return width;	
//		}
//		
		
		//ex2
		
		public void setBoxDimension(int l, int b, int h) {
			if(l>=1 && b>=1 && h>=1) 
			{
				System.out.println("Box Created with dimensions "+l+ " "+b+" "+h+" ");
			}
			else
			{
				System.out.println("Invalid Dimentions");
			}
			
		}
		//Setter method
		public int setLength(int l)
		{
			if(l>=1) {
				length=l;
			}
			else 
			{
			System.out.println("Invalide Length");	
			}
			return length;	
		}
		public int setWidth(int w)
		{
			width=w;
			return width;	
		}
		public int setHeight(int h)
		{ 
			height=h;
			return height;	
		}
		//GETTER method
		public int getLength()
		{
			return length;	
		}
		public int getHeight()
		{
			return height;
		}
		public int getWidth(  )
		{
			return width;	
		}
		
	

}
