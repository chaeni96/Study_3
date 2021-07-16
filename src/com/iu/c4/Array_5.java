package com.iu.c4;

import java.util.Scanner;

public class Array_5 {
	
	public static void main(String[] args) {
		
		//1. 정보출력
		//2. 정보추가
		//3. 정보삭제
		//4. 종  료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 입력해주세요");
		
		boolean flag = true;
		int [] ar = {45, 52, 77};
	
		
		while(flag) {
			System.out.println("1. 정보출력");
			System.out.println("2. 정보추가");
			System.out.println("3. 정보삭제");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1 : 
				System.out.println("정보를 출력합니다");
				if(ar.length==0) {
					System.out.println("출력할 데이터가 없어요");
					continue;
					}
				
				for(int i=0; i<ar.length;i++){
					System.out.println(ar[i]);
				}
				break;
				
			case 2 :
				System.out.println("정보를 추가합니다");
				System.out.println("추가할 정보 입력");
				int plus = sc.nextInt();
				
				int [] ar1 = new int[ar.length+1];
				for(int i=0;i<ar.length;i++) {		
					ar1[i] = ar[i];
				}
				ar1[ar.length] = plus;
				ar =ar1;
				break;
				
			case 3 :
				System.out.println("정보를 삭제합니다");
				if(ar.length==0) {
					System.out.println("더이상 삭제할 데이터가 없어요");
					continue;
				}
				int [] ar2 = new int[ar.length-1];
				
				for(int i=0;i<ar2.length;i++) {
					ar2[i] = ar[i];
				}
		
				ar = ar2;
						
				break;

			case 4 :	
				System.out.println("프로그램을 종료합니다");
				flag = !flag;
			
			}
		
	}

	}
}

