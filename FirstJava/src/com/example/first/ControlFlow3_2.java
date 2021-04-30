package com.example.first;

import java.util.Scanner;

public class ControlFlow3_2 {

	public static void main(String[] args) {

		
		int job;
		Scanner read=new Scanner(System.in);  
		job=99; //초기화가 안되어 있기에 발생할 수 없는 숫자로 작성해둠.  
		//for 루프는 반복하는 횟수가 정해져있을때 
		
		do {
			System.out.println("1.입력\n2.수정\n3.삭제\n4.조회\n5.종료");   //do 화일은 두가 범위가 하나의 명령문으로 해석함. 
																		   //
			System.out.println("작업번호[    ]");
			job = read.nextInt();
			
			
			switch(job) {
			case 1:
				System.out.println("입력 처리중...");
				break;                                //루프에서 벗어나라!!
			case 2:
				System.out.println("수정 처리중...");
				break;
			case 3:
				System.out.println("삭제 처리중...");
				
				break;
			case 4:
				System.out.println("조회 처리중...");
				break;
			default :	
				System.out.println("번호를 확인해 주세요");   //do while 로 해서 - 일단 먼저 실행해 와일 한번 체크하는것. 
				
			}// end of switch
		
		} while(job !=0 ); //end of while
		System.out.println("프로그램을 종료합니다.");
		
	} //end of main

} // end of class
