package com.iu.c1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("Test3 Start");
		//쇼핑몰의 총주문 금액 입력
		//주문금액이 30000 이하면 배송비 3000이 추가 아니면 0
		//총주문 금액 출력
		//ex) 주문 금액 : 25000 -> 28000 출력
		//ex) 주문 금액 : 35000 -> 35000 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 금액을 입력하세요");
		//주문금액
		int price = sc.nextInt();
		
		if(price <= 30000) {
			//배송비 3000 추가
			price = price + 3000;
		}
		
		System.out.println("총 금액 :" +price);
		
		System.out.println("Test3 Finish");
	
	}

}
