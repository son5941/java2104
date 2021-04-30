package com.example.first;

public class ControlFlow5 {

	public static void main(String[] args) {
		// for loop 포 반복문
		// while 비교해서 와일문에서는 반복제어를 위해 
		// 변수 초기화, 조건확인, 루프 안에서 변수 증감  반드시 해주어야 했습니다. 
		// 그러다 보니 이게 불편했다!! 그래서 포를 사용함. 
		// for(제어변수의  초기값; 종료조건; 증감값) {블록이 필요하면 가져오고}
		// 예를 들어 숫자 1부터 10까지의 합계를 구하는 프로그램 만들기 
		// 디버그 모드까지 진행 run- toggle break - step into or step over
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {   //i는 1일고 i 십보다 작을 경우 , i에게 1씩 더해준다
			                       // ;은 
			sum = sum+i;
		}
		
		System.out.println(sum);
		System.out.println("프로그램 종료...");
	} // end of main

} // end of class
