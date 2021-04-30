package com.example.first;

import java.util.Scanner;

public class excercise1 {

	public static void main(String[] args) {
		// 사용자로 부터 숫자를 입력받아 홀수 짝수를 판단하여 출력하는 프로그램을 작성하시오. 
		// 이 프로그램을 계속 반복하게 끔하고 단 0을 입력하면 프로그램을 종료한다. 
		// System.out.println(5%2);  // %는 나머지 값을 확인한다. 
		
		int score=99;
	
		do{
		 
			Scanner read=new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
			score = read.nextInt();
			
		if(score == 0 ) break;	  // 빠져나오는 루프방법, 아래에 넣으면 밑에 로직이 실행되서 나오기때문에 짝수/프린트 아웃으로 된다. 	
			
		if(score %2 ==0 ) {
			System.out.println("짝수");
			
		}else{
			System.out.println("홀수");

		

			
		} //end of if
		
		

		} while(score !=0);
		System.out.println("프로그램 종료");
		

	} // end of main

} // end of class
