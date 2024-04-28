package com.AbstractDetails;

public class Rectangle extends ShapeParent {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.drawShape();
		r.colorShape();
		r.moveShape();
	}

	@Override
	public void drawShape() {
		System.out.println("draw Rectangle shape");
		
	}

	@Override
	public void colorShape() {
		System.out.println("colour rectangle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("move rectangle");
		
	}

}
