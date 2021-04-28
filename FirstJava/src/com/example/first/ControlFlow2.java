package com.example.first;

import java.util.Scanner;

public class ControlFlow2 {

	public static void main(String[] args) {

		//문제  : 생년을 입력받아 나이를 계산하여 
		// 		  미성년이면 '가세요'
		// 		  성년이면 '들어오세요'를 출력하는  프로그램을 작성하시오 
		
		
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
		
		
	
		 /* 4. 미성년이면 '가세요', 
		 성년이면 '오세요'를 출력하자. 
		 조건은 if
		 if(조건식) {
		 참일경우 실행할 코드블럭 
		 } else {
		 거짓일 경우 
		 } */
		
		if(age < 20) { // 미성년인 경우 
			System.out.println(" 너 집에 가~~");
		} else {  //성년인 경우  
			System.out.println("어서 오세요~");
		} 
		
		System.out.println("프로그램 종료");
		
		}
 

}
