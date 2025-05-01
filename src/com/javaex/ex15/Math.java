package com.javaex.ex15;

public class Math {

	//필드
	//private String name;
	//private int price;
	private static final double PI = 3.141592;
	
	
	
	//생성자
	/*
	public Math() {
		
	}
	*/
	
	//메소드 - gs
	
	//메소드 - 일반
	public static int plusii(int a, int b) {
		return a+b;
	}
	
	public static double plusid(int a, double b) {
		return a+b;
	}
	
	public static double plusdi(double a, int b) {
		return a+b;
	}
	
	public static double plusdd(double a, double b) {
		return a+b;	
	}
	
	public static double circleArea(int radius) {
		double result = PI * radius * radius;
		return result;
	}
	
}
