package com.example.first;

public class DataTypes {

	public static void main(String[] args) {
		// 자바의 기본 데이터 타입을 알아보자. 
		// 변수 : 데이터를 보관하는 장소 
		// 변수 : 변수에 제한을 가한다. 기억장소에 따라서 들어가는 데이터의 유형이 결정된다. 
		// 데이터의 유형에 따라 변수에는 데이터 타입이 선언한다. 
		// 데이터의 유형은 정수형이나, 실수형이나, 문자형, 부울or 불or 불리언(boolean = 참과 거짓)
		// 이러한 것들이 데이터의 생김세이다. 
		// 자바에는 8개의 primitive Data Types.
		// 1. boolean type : ture or false 중 한 값을 갖는다. 
		// 2. byte type : 1바이트(8개 bite) 데이터로  -123 ~ 127 까지 숫자로 표현할 수 있다. 2에 7승->127개의 데이터를 표현할 수 있다. 
		// 3. short type : 정수형. 16bit의 정수형 데이터 
		// 4. int type : 32bit 정수형
		// 5. lone type : 64bit 정수형
		// 6. double : 64bit 실수형 데이터 
		// 7. float type : 32bit 실수형 
		// 8. char type : 16 bit  문자형 데이터 저장 (케릭터 타입)
		
		boolean gender = true;
		System.out.println(gender);
		
		byte range ;
		range = 127;
		System.out.println(range);
		
		short temperature;
		temperature = 23767;   //최대 범위가 23767이다. 23768로 넘어가면 인식 못함. 
		
		//long    //태양까지 거리를 미터 단위로 환산하시오. 
		
		// 테이터 타입은 얼마만큼 조정할수 있는지에 따라 결정된다. 
		
		//참조형 데이터 타입 클래스를 이용해 복합적으로 구성되는 데이터 타입들. 
	}

}
