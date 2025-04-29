package com.javaex.ex02;

public class Goods {

	//필드
	
	private String name;
	public int price;
	
	//생성자
	
	
	//메소드
	//name 값 입력
	public void setName(String n) {
		name = n;
	}
	//name 읽어보기
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
	
}
