package com.example.first;

public class Operators {

	public static void main(String[] args) {
		// Operators 연산자 : 변수(들)에 대해 수행하는 연산 , 데이터 조작 처리하는것(operation)을 기호로 표현한 것.
		// 대상을 피연산자 (오퍼런트) : ex) +연산자는 앞뒤의 두 개의 오퍼레이트를 더하라 
		// Arithmetic Op(operators). 산술연산자 : +,- , *, / ,%(나머지), 
		// Assignment op 대입 연산자 : =, +=, -=, *=,
		// - ex) sum = sum+1      = sum += 1
		
		// Relational op 관계 연산자 : 두 오퍼렌드 간의 관계 >, >=(크거나 같다), <, <= ,==(같다) ,!=(같지 않다)
		// 관계연산자는 불타입으로 투루 오알 폴스
		
		// Logical op 논리 연산자 : 불타입으로 결과가 돌려지는 것, 보통 관계 연산을 가져서  (and)&&: 둘다 참, or|| : 둘중 하나만, !(not ) 
		
		// unary op 단항 연산자 : +(잘 안쓴다), - ex) 마이너스 10 표기할때.  
		// ++(하나씩 증가 ex) : a++ = a=a+1  // a += 1 // a-- // a=a-1 // a-=1 같은 의미이다. 	
		// Bitwise op 비트 연산자 : &, ^(or), ~, >>(오른쪽으로 쉬프트 연산), <<
		// ex : 5<< - 왼쪽으로 한비트 00000101  -> 래프트 쉬프트 ->00001010 ->한번더 - 00010100
		// 숫자를 비트 단위로 연산을 해서 수행하는것 - ex) 5를 비트로 바꾸면 00000101 3을 비트로 바꾸면 0000011 이 둘을 더하는데 1같이 되어잇는 숫자만 확인 하면 00000001 이게 된다. 
		
		//특별한 연산자 (other operators) 
		//instanceof : 임의 객체가 특정 클래스의 인스턴스 이냐?
		
		// 사람클래스에 프로그래머는 = 프로그래머로 부르겠다. 
		String str= "Programmer";  //문자열이라서 더블쿼트 들어감. 
		boolean result;
		
		// 그렇다면 프로그래머는 사람이냐?
		result = str instanceof String; // str 객채 변수가 instanceof가 String클래스의 객체이냐? 
		System.out.println(result);
		
		// 클래스 이름 적어주고 그 앞에는 객채 ex ) 사람 클레스 - 객채는 의사, 프로그래머  (String클래스 , str(객채)
		// ternary operator 삼항연산자 
		// 변수 = 조건식 ? 수식(값) : 수식(값)
		
		// ex 2월에 날수가 28일이면 평년 그렇지 않으면 윤년이라고 한다. 
		
		int febDays = 29 ;
		String isLeapyear;
		
		isLeapyear = (febDays == 28)? "평년" : "윤년" ;  // ? 는 뭐뭐 이면 물음표 앞과 물음표 뒤에값을 비교한다. 
		
		System.out.println(isLeapyear);
		
		
		
		
		
		
		//System.out.println(2*2);

		
		
		//int a = 10;
		//int b = a++;  케이스 1
		//int b = ++a;   //케이스 2
		
		
		
		//System.out.println(a);   //11
		//System.out.println(b);   //10
		

		//  int a = 5, b =3 ;  //동일한 데이터 타입의 변수를 여러개 선언할때 이런식으로 해도 된다. 
		//  int c = a&b ;		
		//  System.out.println(c);  //이진수 방법으로 합칠때 비트 연산자사용
		
		int a=5, b=3, c=0, d=0 ;
		c=a<<1;   //래프트 쉬프트 1번 2에 1승만큼 커지는것
		d=a<<2;   // 래프트 쉬프트 2번  2에 2승만큼 커지는것
		
		// 라이트 쉬프트는 나누기의 개념이다. 
		System.out.println(c);
		
		
		
	} // end of main

} //end of class