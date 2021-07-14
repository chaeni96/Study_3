package com.iu.c1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("Test5 Start");
		Scanner sc = new Scanner(System.in);
		
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
	
		//입력할 id
		int yId =0;
		//입력할 pw
		int yPw =0;
		
		System.out.println("ID를 입력하세요");
		//ID 입력 후 저장
		yId = sc.nextInt();
		
		System.out.println("PW를 입력하세요");
		//PW 입력 후 저장
		yPw = sc.nextInt();
		
		if (yId == id && yPw == pw) {
			
		System.out.println("로그인 성공");
		}
		//로그인이 성공하면 - 로그인 성공 출력
		
		
		
		
		System.out.println("Test5 Finish");
	}

}
