package com.javaex.ex05;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메소드
	//save name
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	//save price
	public void setPrice(int p) {
		price = p;
	}
	
	//read price
	public int getPrice() {
		return price;
	}
	
//	//enter info
//	public void showInfo() {
//		System.out.println("==========");
//		System.out.println("name: " + name);
//		System.out.println("price: " + price);
//		System.out.println("==========");
//	}
	
}
