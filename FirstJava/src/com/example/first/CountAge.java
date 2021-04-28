package com.example.first; 
//시스템. 기본라인이 아닌 유틸리티 패키지의 클래스에서 사용하겠다. 

import java.util.Scanner; // 자바.유틸폴더에서 스케너라른 클레스를 - import(가져오다)이것좀 가져다 주세요 (클레스를 가져다 주세요)


public class CountAge {

	public static void main(String[] args) {
		// 나이계산하기 :생년을 받아서 2021년 에서 뺀다
		// 나이 = 2021 - 생년
		
		int birthYear;
		int age;   //예전에는 무조건 선언하고 사용을 따로 한다. 
		
		
		
		
		// birthYear = 1990;
		// 개선 할 것이다. 사용자로 부터 데이터를 입력 받도록 수정 
		
		//age = 2021 - birthYear;  //객체 지향으로 나왔는데 int age = 2021 - birthYear 이런식으로 표기한다. 하지만 비추. 어디서 변수 선언이 된지 모르기때문에
		
		// 입력을 위해 Scanner 클래스 객체를 선언한다. 
		
		Scanner reader = new Scanner(System.in);    //in에서 데이터를 받겠습니다. 시스템에 생성자를 입력해서 리더에 주겠다. 
		System.out.print("생년을 입력 하세요 :  ");  //한번 벌스 다음으로 작성해서 확인해보자 왜나하면 next.int이것을 확인하기 위해!
		
		birthYear = reader.nextInt();    //읽어온 값! 인트 타입으로 읽어 온 값! 정수형으로 읽어 오겠다. 
		
		age = 2021 - birthYear;
				//스케너는 시스템 만큼 자주 사용하지 않기에 먼저 빨강색으로 뜬다. 메모리 공간을 잡아 먹기 때문에 . 
				//필요할때 이야기해서 클레스를 가져오도록 한다. 
		
		System.out.printf("%d년에 태어난 사람은 %d세입니다. \n", birthYear, age);   //서식 지정해두면 무조건 ln이 아니라 f이다. f는 함수값을 지정하는것이다. 
		System.out.println("프로그램 종료...");
		
		//직접 데이터를 집어 넣고 프로그랭하는 방법. 
		
		
	
	}

}
