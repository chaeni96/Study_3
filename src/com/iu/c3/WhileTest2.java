package com.iu.c3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		Scanner sc = new Scanner(System.in);
		
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
		
		int id =1234;
		int pw =5678;
		
		boolean flag = true;
		while(flag) {
			System.out.println("1.로그인 2.종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("로그인 시도");
				
				System.out.println("Id를 입력해주세요");
				int yId = sc.nextInt();
				System.out.println("Pw를 입력해주세요");
				int yPw = sc.nextInt();
				if(yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else { 
				System.out.println("종료");
				flag = false;
			}
			
		}
		
		
		if(flag) {
			System.out.println("로그인 성공 했을 때 실행");
			
			int level = 1;
			int gold = 0;
			
			for(level = 1;level<15;level++) {
				if(level%5 ==0) {
					gold = gold + level*200;
					System.out.println(gold+" gold 지급");
				}
				System.out.println("현재레벨 : " +level);
				for(int mon=0;mon<level*3;mon++) {
				System.out.println(mon+1+"마리 사냥 성공");
				}
				System.out.println("=== 축! 레벨 up ===");
			}
			System.out.println("최종 레벨 : "+level);
			gold = gold + level*200;
			System.out.println("최종 Gold : "+gold);
		}
		
		sc.close();
		System.out.println("WhileTest2 Finish");
	}
	

}
