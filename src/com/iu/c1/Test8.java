package com.iu.c1;

import java.util.Scanner;

	public class Test8 {
		public static void main(String[] args) {
		
		System.out.println("Test8 Start");
		
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
				
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();

		total = kor+eng+math;
		avg = total/3.0;
		
		// 합격 기준
		// 평균이 60점 이상
		// 과목당 40점 이상
		
		String result = "불합격";
		
		if(avg>60 && kor>40 && eng>40 && math>40) {
			result= "합격";
		}
		
		System.out.println(result);
		

//		------------- 2차 코드 --------------------------
//		if(avg> 60) {
//			if(kor>40 && eng >40 && math>40) {
//				System.out.println("불합격");
//			}
//			
//		}else {
//		
//		System.out.println("불합격");
//		}
//		
				
//		------------- 1차 코드 --------------------------
//		 if(avg>=60){
//		  if(kor>40) {
//			  if(eng> 40) {
//				  if(math > 40) {					  
//				  }
//				  System.out.println("합격");
//			 }else {
//				 System.out.println("수학 과락 불합격");
//			 }
//				 System.out.println("영어 과락 불합격");
//			 }
//			  System.out.println("국어 과락 불합격");
//		  }
//		   System.out.println("불합격");
//		   }
//		----------------------------------------------------------------------
		
		
		
		System.out.println("Test8 Start");
		sc.close();
		}
		
	}

