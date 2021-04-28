package com.example.first;

public class Variables {

	public static void main(String[] args) {
		// java variables 변수는 
		// 기억장소에 부여되어진 이름, 데이터를 저정하는 메모리상의 위치(에 부여한 이름)
		// 변수 이름부여에는 규칙이 있다. - 변수 명명 규칙
		// 문자(영문자), 숫자를 이용한다. 
		// 특수 문자 중에서는 _(언더바, 언더스코어)와 $ sign을 사용한다. 다른 특수기호는 변수명을 줄 때 주지 않는다. 
		// case sensitive 대소문자를 구분한다. 
		// 변수명을 Number1 , number1 이 두개는 다른것으로 인식한다. 
		// 변수명 중간에 white space 절대 금지!! (화이트 스페이스는 공백이라고 말함)
		// 변수명을 정할 때 의미있게 만든다. 
		//  숫자는 number, birthyear, 프로그램어떤 목적으로 하는지 표시해주면 가독성이 편함. 
		// camel notaion : naturalNumber - 앞에 단어 소문자, 새롭게 단어가 바뀔때 대문자. 바뀌는 단어에서 대문자를 쓴다. 
		// 변수명을 사용하면서 키워드(예약어) 사용금자 (Java프로그램이 정해놓은것들 ex: public, package, ln, main 변수명을 쓰면 안된다.
		
		// 변수 선언 요령 방법 : 타입 변수명 ;
		
		int age;   //정수형 변수 age를 선언 
		float cTem; //실수형 변수 ctem(온도)를 선언
		double cTemp;
		
		//지금까지는 데이터가 등록되어있지 않은 상태
		
		age=26; 		 //실수중 float 타입 뒤에서 f를 작성해준다. 변수 age에 값 26을 할당.(대입)
		cTem = 36.5f;  //실수중 float 타입 뒤에서 f를 작성해준다. 변수 age에 값 26을 할당.(대입)
		cTemp = 36.55;
		
		//alt + ctrl + 방향키는 문장을 복사한다.
		
		System.out.printf("%d\n", age);   // %d는 십진수로 표기
		System.out.printf("%f\n", cTem);  // %f는 소수점으로 표기 
		System.out.println("0123456789");
		System.out.printf("age : %5d\n", age);  // 5자리로(띄워쓰기) 찍어라   
		System.out.printf("Temp. : %5.1f\n", cTem);  //5자리중에 소수자리 한자리로 찍어라.
		System.out.printf("All : %4.2f, %b", cTem, age);   //소수점 4에서 포인트 찍고 2자리까지
		
	}

}
