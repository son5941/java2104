package com.example.first;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=99;
		
		for(;;){       //(;;)는 무한루프이다. , while(ture or 1)을 넣으면 무한 루푸이다. 같은 방식. 
		 
			Scanner read=new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
			score = read.nextInt();
			
		if(score == 0 ) break;	  // 빠져나오는 루프방법, 아래에 넣으면 밑에 로직이 실행되서 나오기때문에 짝수/프린트 아웃으로 된다. 	
			
		if(score %2 ==0 ) {
			System.out.println("짝수");
			
		}else{
			System.out.println("홀수");

		

			
		} //end of if
		
		

		} 
		
		System.out.println("프로그램 종료");
	}// end of main

} //end of class
