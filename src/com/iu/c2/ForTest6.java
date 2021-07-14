package com.iu.c2;

import java.util.Scanner;

public class ForTest6 {
	
	public static void main(String [] args) {
		System.out.println("ForTest6 Start");
		
		Scanner sc = new Scanner(System.in);
		
		//회원가입시 입력한 ID
		int id =1234;
		//회원가입시 입력한 PW
		int pw =5678;
		
		//최대 5번 기회
		//1. 최대 5번 로그인 시도
		//
		
		boolean flag = false;
	
		
		for(int i=0; i<5;i++) {
			if( i != 0) {
				System.out.println(i+1+"번째 시도");
			}
			System.out.println("ID를 입력하세요");
			int yId = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int yPw = sc.nextInt();
			if(yId == id && yPw == pw) {
				flag = !flag;
				//flag = true;
				break;		
			}
	
			System.out.println(i+1+"번째 로그인 실패");
	
		} //for 끝
			
		//for 종료 조건 로그인 성공과 5번 모두 실패
	
		if(flag == true) {
			System.out.println("로그인 성공");
		}else {
		System.out.println("로그인 실패 은행에 방문");}
		
		

		sc.close();
		System.out.println("ForTest6 Finish");
		
	}

}
