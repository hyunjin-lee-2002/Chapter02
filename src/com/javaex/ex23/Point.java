package com.javaex.ex23;

public class Point extends Shape{
//public class Point extends Shape
	//
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();
		//this.x = x;
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//메소드 gs
	public int getX() {
		return x;
	}
	public void setX (int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY (int y) {
		this.y = y;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void draw() {
		System.out.println("=====점을 찍음=====");
		System.out.println("x:"+y);
		System.out.println("y:"+x);
		System.out.println("==================");
	}
	
	
	
}
