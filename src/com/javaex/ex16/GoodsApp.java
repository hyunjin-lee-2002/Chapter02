package com.javaex.ex16;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		//굿즈를 관리할 배열 3칸을 만듦
		Goods[] goodsArr = new Goods[4];
		
		//상품을 메모리에 올림
		Goods cup = new Goods("cup", 2000);
		Goods camera = new Goods("Nikon", 400000);
		Goods laptop = new Goods("Lg Gram", 1000000);
		
		//배열에 상품의 주소를 대입
		goodsArr[0] = cup;
		goodsArr[1] = camera;
		goodsArr[2] = laptop;
		
		//모든 상품의 이름을 출력
		for (int i = 0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
		}
		
		/*줄바꿈*/ 
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		//모든 상품의 정보를 출력
		for (int i = 0; i<goodsArr.length; i++) {
			goodsArr[i].showInfo();
		}
	}

}
