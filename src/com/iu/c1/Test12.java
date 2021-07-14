package com.iu.c1;

public class Test12 {
	public static void main(String [] args) {
		System.out.println("Test12 Start");
		
		int num=0;
		
		switch(num*3+1) {
		case 1:
			System.out.println("case 1");
			break;
		case 2: 
			System.out.println("case 2");
			break;
		case 3: 
			System.out.println("case 3");
			break;
		default :
				System.out.println("그외 나머지");
				break;
		
		}
		
		System.out.println("Test12 Finish");
	}

}
