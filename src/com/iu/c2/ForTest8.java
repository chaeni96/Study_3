package com.iu.c2;

import java.util.Scanner;

public class ForTest8 {
	
	public static void main(String[] args) {
		System.out.println("FortTest8 Start");
		Scanner sc = new Scanner(System.in);
		// 분,초 출력
		//0분 0초 
		//0분 1초
		//...
		//0분 59초
		//1분0초
		//분, 초를 입력 1,10
	
		System.out.println("분 입력");
		int m = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();
		boolean flag = false;
		for(int minute=0;minute<60;minute++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(minute+"분 : "+sec+"초");
				if(m==minute && s== sec) {
					System.out.println("종료");
					flag = true;
					break;
					}
		}
		if(flag) {
			break;
		}
	}	
		
		sc.close();
		System.out.println("ForTest8 Finish");
	}

}
