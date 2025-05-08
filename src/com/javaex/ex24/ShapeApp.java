package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Shape[] sArray new Shape[4];
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable dp = new Point(5, 100); 
		
//		dp.draw();
//		((Point)dp).getX();
		
		Drawable dt = new Triangle("red", "red", 10, 20);
		Drawable dr = new Rectangle("blue", "blue", 30, 50);
		Drawable dc = new Circle ("green", "green", 5);
		
		dArray[0] = dt; //Triangle
		dArray[1] = dr; //Rectangle
		dArray[2] = dc; //Circle
		dArray[3] = dt; //Point
		
		//한번에 그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//한번에 면적 구라기
		for(int i=0; i<dArray.length; i++) {
			((Shape)dArray[i]).area();
		
		
		
			
		}
	
	}
	
}