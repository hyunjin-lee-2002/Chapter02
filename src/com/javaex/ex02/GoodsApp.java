package com.javaex.ex02;

//class (틀)

public class GoodsApp {
	public static void main (String[] args) {
		
		//시나리오
		
		Goods camera = new Goods ();
		
//		camera.price = 400000;
//		System.out.println(camera.price);
		
		//save name
		camera.setName("니콘");
		String name = camera.getName();
		System.out.println(name);
		
		//save price
		camera.setPrice (400000);
		int price = camera.getPrice();
		System.out.println(price);
		
		
		
//		Goods camera = new Goods();
//		camera.name = "니콘";
//		camera.price = 400000;
//		System.out.println(camera.name);
//		System.out.println(camera.price);
//		
//		System.out.println("===================");
//		
//		Goods laptop = new Goods();
//		laptop.name = "LG Gram";
//		laptop.price = 1000000;
//		System.out.println(laptop.name);
//		System.out.println(laptop.price);
//		
//		System.out.println("===================");
//		
//		Goods cup = new Goods();
//		cup.name = "머그컵";
//		cup.price = 2000;
//		System.out.println(cup.name);
//		System.out.println(cup.price);
	}
	
	
}
