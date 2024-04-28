package com.Interface;

public class CircleChild implements ShapesParent{

	public static void main(String[] args) {
		CircleChild c = new CircleChild();
		c.drawShape();
		c.colorshape();
		c.moveShape();
	 
	}

	@Override
	public void drawShape() {
		System.out.println("Draw circle");
		
	}

	@Override
	public void colorshape() {
		System.out.println("colour circle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("move shape");
		
	}

}
