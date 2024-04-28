package com.AbstractDetails;

public class Circle extends ShapeParent{
	
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawShape();
		c.colorShape();
		c.moveShape();
		
				
		
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("colour circl");
		
	}

	@Override
	public void moveShape() {
		System.out.println("movig circle");
		
	}

}
