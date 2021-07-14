package com.iu.c3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		Scanner sc = new Scanner(System.in);
		
		int id =1234;
		int pw =5678;
		
		//1. 로그인
		// -id,pw 입력
		// - 로그인 판단
		//2. 종 료
		
		//로그인 성공, 로그인 안됐거나
		//로그인이 성공했으면 게임을 시작
		//rpg 게임 
		//최초 레벨은 1, 만렙 15
		//최초 gold는 0
		//레벨 5를 달성시 1000gold 지급
		//레벨 10을 달성시 2000gold 지급
		//레벨 15를 달성시 3000gold 지급
		
		//모든 몬스터의 경험치는 동일
		// 1 -> 2 : 3
		/* 몬스터 1마리 사냥
		 * 몬스터 2마리 사냥
		 * 몬스터 3마리 사냥
		 */
		//레벨업
		// 2 -> 3 : 6
		// 3 -> 4 : 9
		// 4 -> 5 : 12
		//...
		// 14 -> 15 : 42
		//축 레벨 ?이 되었습니다 출력
		//최종레벨 출력
		//최종 gold 출력
		
		boolean check = true;
		while(check) {
			System.out.println("1.로그인 2.종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("Id를 입력해주세요");
				int yId = sc.nextInt();
				System.out.println("Pw를 입력해주세요");
				int yPw = sc.nextInt();
				if(yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					check = !check;
				}else {
					System.out.println("로그인 실패");
				}
			}else if(select == 2) {
				break;
			}
		
		}
		System.out.println("WhileTest2 Finish");
	}
	

}
