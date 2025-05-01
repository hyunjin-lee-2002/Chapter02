package com.javaex.ex14;

public class Goods {


	//필드
	private String name;
	private int price;
	private static int count;
	
	

	//생성자
	public Goods() {
		count = count+1;
	}
	public Goods (String name, int price) {
		this.name = name;
		this.price = price;
		count = count+1;
	}
	
	//메소드 - gs
	//메소드 - 일반
	
	//save name
	public void setName(String name) {
		this.name = name;
	}
	
	//read name
	public String getName() {
		return name;
	}
	
	//save price
	public void setPrice(int price) {
		this.price = price;
	}
	
	//read pirce
	public int getPrice() {
		return this.price;
	}
	
	
	public int getCount() {
		return count;
	}
	
	
//	//print info
	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("price: " + price);
		System.out.println("==========================");
	}
}
	


