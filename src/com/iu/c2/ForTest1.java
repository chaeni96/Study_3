package com.iu.c2;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String [] args) {
		
		System.out.println("ForTest1 Start");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복할 횟수를 입력");
		int count = sc.nextInt();

		for(int i=0;i<count;i++) {
			System.out.println("Hello" +i);
		}
		// 0 -20 미만 짝수만 출력-요구사항
		
		for(int i=0;i<20;i++){
			if(i%2 == 0) {
			System.out.println(i);
		}
		
	}
		
		System.out.println("=========================");
		
		//if문을 사용하지 않고 출력
		for(int i=0;i<20;i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("ForTest1 Finish");
		sc.close();
	}

}