package com.javaex.ex20;


public class PointApp {

	
	public static void main(String[] args) {	

		Point p = new Point();
		//System.out.println(p.toString());
		
		
		ColorPoint cp = new ColorPoint(5, 3, "red");
		System.out.println(cp.toString());
		
		cp.draw();
		
		//Point(2)
		//ColorPoint(3)
		
	}

}