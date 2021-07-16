package com.iu.c4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목의 수를 입력하세요");
		int count = sc.nextInt();
		
		int [] nums = new int[count];
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+1+"번 점수 입력");
			nums[i] = sc.nextInt();
		}
		//각 인덱스 번호에 숫자를 입력
		int total = 0;
	
		for(int i= 0;i<nums.length; i++) {
			System.out.println(nums[i]);
			total = total + nums[i];
		}
		double avg = total/(double)nums.length;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
	}
}

