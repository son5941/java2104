package com.example.first;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자 중
		// 입력받은 수의 배수를 찾아 입력하시오. 
		// 1. 준비
		
		Scanner read = new Scanner(System.in);
		int num;
		 
		
		// 2. 입력받기
		System.out.println("어떤수의 배수를 확인할까요?");
		num = read.nextInt();
		
		// 3. 수를 1부터 100까지 반복

		
		for(int i = 1; i<=100; i++) {
		    // 3.1 수가 입력받은수의 배수인지 판단 출력하기 
			if(i % num == 0) System.out.printf("%3d   ", i); //공백이 없으면 나오는 숫자가 따닥 붙어서 나온다. 
		}
	System.out.println("\n프로그램 종료합니다.");  //  \n은 줄바꿈. 
	} 
		// 4. 프로그램 종료  
	    // 이후에 공배수를 출력할 수 있다. 
		
		
		
		
	

}
