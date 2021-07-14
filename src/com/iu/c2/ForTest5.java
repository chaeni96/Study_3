package com.iu.c2;

import java.util.Scanner;

public class ForTest5 {
	
	public static void main(String [] args) {
		System.out.println("ForTest5 Start");
		Scanner sc = new Scanner(System.in);
		
		//과목수 입력
		System.out.println("과목 수를 입력하세요");
		
		//과목수를 담을 변수
		int count = sc.nextInt();
		
		//총점을 담을 변수
		int total = 0;
		
		//평균을 담을 변수
		double avg = 0.0;
		
		//과목수 만큼 점수 입력
		for(int i=0;i<count;i++) {
			System.out.println(i+1+"번째 점수를 입력하세요");
			int point = sc.nextInt();
			total = total +point;
		}
		avg = total/(double)count;
		
		//총점 평균 계산 후 출력
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		System.out.println("ForTest5 Finish");
		
		sc.close();
	}

}
