package com.example.first;

public class exDay2 {   //public 누가 사용할수 있는지 알려주는것. 

	public static void main(String[] args) {   //고정된속성, 동적인속성을 나타네는 메소드 , 지금은 메소드 중 메인메소드
		// TODO Auto-generated method stub
        // static 객채화 되어있지 않음에도 사용할수 있는 메소드. (메인메소드 설정은 퍼블릭 스테틱)
		// void 메소드를 만들때 - 돌려주는 타입이 없는 경우 void라고 한다. 
		//string - 페러미터가 문자열로 들어오는. args라는 이름으로 부르겠다 []배열요소가 여러개가 들어올 수 있다. 
		
		// 지난시간에 배운것을 복습 및 연습 
		
		char ch1 = '5';     //문자형 변수, ch1 선언하고 문자 5를 할당한다. 문자열은 싱글쿼트를 붙여준다. 
		char ch2 = 'a';
		
		
		
		System.out.println(ch1);
		System.out.println(ch2);
	
		// convert char to int 문자형 데이터를 정수형으로 변환
		// 문자는 숫자로 저장될 때 ascii 값으로 저장된다. 
		// 정수형 변수에 문자 변수를 대입
		
		//int num1 = ch1;
		//int num2 = ch2;
		
		
		// 문자열을 정수형으로 변환
		
		int num1 = Integer.parseInt(String.valueOf(ch1));
		
				                            //인테저(integer)클레스에서 가져올때는 대문자!!! , parseInt 함수는 매개변수를 필요할때 string 타입의 매개변수가 필요하다. 
											// ch1은 문자 변수다.  parseInt(매소드다) 는 정수형을 문자형으로 변화해주는 역할을 한다. 
				                            // (String.valueof(ch1)-> char을 문자열로 바꿔주는 역할을 한다. 
											// 문자열 - 여러개의 문자가 복합적으로 들어가있는것 대부분 "로 표기 
		                                    // 문자는 '싱글커트로 표기해준다. 
		                                    // 예를 들어 ch1이 숫자가 아닐때 변환이 안된다. 그렇다면 '5' 문자를 - 숫자 5로 바꾼다는 것.
		
		System.out.println(num1);
		// System.out.println(num2);
		
		
		
		
		
	} // end of main()메인 : 메인 메소드의 끝이다. 

}   // end of class exDay2 
