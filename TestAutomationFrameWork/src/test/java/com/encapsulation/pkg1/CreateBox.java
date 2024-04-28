package com.encapsulation.pkg1;

import org.checkerframework.checker.units.qual.Length;

public class CreateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common cm = new Common();
//		int h =cm.height=10;   //this 3 are effected by private
//		int l= cm.length=20;
//		int b =cm.width=30;
		
		int b= cm.setWidth(10);//we are not calling directly .we get the values get and set
		int l= cm.setLength(11); //if i give any value it will as 0 it as give invalid dimention
		int h= cm.setHeight(15);
		
		cm.setBoxDimension(l, b, h);
		
		
		System.out.println(cm.getLength());
		System.out.println(cm.getHeight());
		System.out.println(cm.getWidth());
		

	}

}
