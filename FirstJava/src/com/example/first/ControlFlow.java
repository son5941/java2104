package com.example.first;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// 제어 흐름에 대한 이해 
		// 이세상 모든 로직은 3가지로 처리된다. 
		// 순차제어 : 일의 처리가 순차적으로 진행되어 지는 것
		// 조건제어 : 조건에 따라 처리 내용을 달리 진행하는 것 
		// 반복제어 : 특정한 과정을 반복하여 처리하는 것 
		// *********들여씨기 방법 - ctrl + i
		
		
		// pseudo code : 일상어로 표기 의사 코드, 유사코드 - 아래를 수도코드라고 한다. 
		// 문제 : 생년을 입력 받아 나이를 계산하여 출력하는 프로그램을 작성하시오 
		// 1. 준비(사용 변수 선언 및 초기화)
		
		Scanner read=new Scanner(System.in); //new 생성자를 호출한다. 객체를 만들어서. 
		                                     //scanner이건 생성자 왜냐면 클레스 이름과 메소드 이름이 같아서
		
		int baseYear=2021, birthYear, age ;
		
	
		// 2. 사용자로부터 생년을 입력받는다. 변수에 대입한다.
		
		System.out.println("생년을 입력해 주세요. : ");   // ()쳐지면 메소드, 
		
		
						// 컨스트럭터는 클래스의 객채를 만들어주는 역할을 하는 메소드 ( 클래스와 메소드의 이름이 비슷할때)
		
		birthYear = read.nextInt();   	// 스케너 클래스의 메서드, 정수형 데이터를 읽는 메서드. 
										//스케너클래스 변수가 가지고 있는 메소드 중에 데이터 값을 읽어오는 변수를 낵스트로 시작한다. 
		                              // 읽어오는 데이터를 정수형으로 읽겠다. 스케너라는 클레스의 함수. 
										//api 다큐먼트 에서 확인할수 있다. 
		
										// read 변수안에는 스케너 클레스가 있다. 스케너 클레스의 객체 
										// new 는 클래스를 가지고 객채 생성하는 방법 
		
		// 3. 나이를 계산한다. 
		
		age = baseYear - birthYear;
		
		
		
		// 4. 계산된 결과를 출력한다. 
 
		System.out.println(age);
		System.out.println("프로그램을 종료합니다");
		
		// 순차적 제어방식입니다. 
		
		// System.out.println();    - system의 클래스에서 . out 속성클래스에서 , (메소드는 끝에 ()가붙어 있다). println 메소드)
		
		
		
		
		
	} // end of main()

} // end of class
