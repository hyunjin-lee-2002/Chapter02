package com.javaex.ex05;

public class GoodsApp {
	public static void main (String[] args) {
		 
		//메모리에 올리기
		Goods camera = new Goods ();
		Goods cups = new Goods ();
		Goods laptop = new Goods(); 
		
		//니콘 세팅
		camera.setName("nikon");
		camera.setPrice(400000);
		
		//머그컵 세팅
		cups.setName("cup");
		cups.setPrice(2000);
		
		
		//그램 세팅
		laptop.setName("Lg Gram");
		laptop.setPrice(1000000);
		


		/*
		
		//니콘 출력
		String cameraName = camera.getName();
		int cameraPrice = camera.getPrice();
		//System.out.println("==========");
		System.out.println("name: "+cameraName);
		System.out.println("price: "+cameraPrice);
		
		//머그컵 출력
		String cupsName = cups.getName();
		int cupsPrice = cups.getPrice();
		System.out.println("==========");
		System.out.println("name: "+cupsName);
		System.out.println("price: "+cupsPrice);
		
		//그램 출력
		String laptopName = laptop.getName();
		int laptopPrice = laptop.getPrice();
		System.out.println("==========");
		System.out.println("naem: "+laptopName);
		System.out.println("price: "+laptopPrice);
		
		*/
		
	}
}
