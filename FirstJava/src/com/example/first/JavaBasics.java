package com.example.first;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 왜 이런식으로 프로그램을 짰는지 모를 수가 있기 대문에 주석을 달아 설명해준다. 
		// 간단한 출력함수를 이용한 메시지 출력
		// System은 클래스 
		// out는 표준 출력 장치 - 기본적으로 모니터를 의미함
		// in은 입력장치이다. 
		// println() 행 단위 출력 함수(메소드)method
		// 아래는 실행문이다. 
		// ln은 줄바꿈 , 그냥 print 는 줄바꿈이 없음. 
		// 역슬레시 \n 은 줄을 바꿔라는 의미가 있다. 
		// printf -> print formation -> 서식을 지정해서 자리수를 몇자리 이하로 확보해서(10진수 or 16진수..)서식 지정
		// %d 십진수 %x 16진수 %f 실수(소수점을 포함한) 수로 출력해라. 
		// 한꺼번에 주석처리 하기 - 주석설정할 곳을 정한다음에 ctrl + /
		// 16진수 읽을때는 "16진수 11이라고 읽는다"
		// ctrl + shift + /는 여러라인의 주석 설정 /*
		// 줄삭제는 ctrl+d
		// 복사해서 하는것보다 알트키 눌러서 방향설정하면 위로 이동함.
		
		/*
		 * 출력메서드의 종류 
		 * println : 행단위의 출력 
		 * print : 단순출력 
		 * printf : 서식지정 출력
		 * 
		 */
		
		System.out.println("간단한 출력 메시지...");
		System.out.println("프로그램 종료");
		System.out.print("print()함수로 출력 1st\n");
		System.out.print("print()함수로 출력 2st\n");
		System.out.printf("%d %x %f", 123, 17, 1.23);
		
	}

}
