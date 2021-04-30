package com.example.first;

import java.util.Scanner;

public class ControlFlow2_1 {

	public static void main(String[] args) {
		// if ~ else 를 조금만 변형할 것.
		// if(조건){ 참일경우 실행할 문장}
		// else {거짓일 경우 실행할 문장}
		// 성적 처리시 
		// if (조건 1) {조건 1이 참인경우 실행할 문장}
		// else if(조건 2){조건 2가 참일 경우 실행할 문장}
		// else if(조건 3){조건 3이 참인 경우 실행할 문장}
		// ... 수십번 수백번 나올 수 있음. 
		// else if(조건n) {조건 n이 참인 경우 실행할 문자}
		// else { 그 외의 경우 실행할 문장}
		

		int score ;
		
		Scanner reader = new Scanner(System.in);    //in에서 데이터를 받겠습니다. 시스템에 생성자를 입력해서 리더에 주겠다. 
		System.out.print("점수를 입력하세요 :  ");
		
		score = reader.nextInt(); 
		
	    char grade;
		
		if (score>= 90) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score >=60) {
			grade ='D';
			
		}else {
			grade = 'F';
			
		}
		System.out.println(grade);
	}

}
