package com.javaex.ex14;

import com.javaex.ex14.Goods;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		System.out.println(camera.getCount());
		
//		camera.showInfo();
		
	//	System.out.println(camera.getCount());
		
	//	camera.setCount(100); 
		
		
		
//		System.out.println("Name: " + camera.getName());
//		System.out.println("Price: " + camera.getPrice());
	}

}
