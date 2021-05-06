package com.example.first;

public class PersonTest {

	public static void main(String[] args) {
		
		// 기존에 프리빗으로 데이터를 선언하였음.
		// 참조형 변수, 참조형 데이터 타입
		// person.java 클레스 (틀을 만들어) -> 객체를 만듬. 
		// 엑세스 모디 파이  : (접근한정자 )메소드를 외부에서 할것이냐, 나만슬꺼냐, 우리 가족만쓸것인가. 
		// 페키지 않에 묵인것은 같은 동네 사람
		// 나중에 클래스가 상속이란 개념이 생김 - ex)아버지의 땅에 본인이 농사지으면 상속 내가 접근할 수 있다. 
		// ex) 아버지가 가진 땅에도 아들이 접근하지 못할때가 있다. 이럴땐 온전히 사적인것 외부에서 접근을 못하게 막을때 
		// ex) 전국에 다 건드려도 아무상관 없을때 - public , 동네에서 package, 상속을 받아서 오로지 혼자서 쓴느건 privite
		
	    //!!! 엑세스 모디파이어(접근한정자) 종료   (class, Pakage, inherited(상속받아서), Others(전국에서 다와서)) 
		// public        :  모두 포함
		//protected      : other 제외하고 다 포함
		// default       : other, inherited 제외하고 포함   (따로 선언하지 않으면 디폴트)
	     //Private       : class 만 포함.  
		
	     //
		
		// 퍼슨 클레스의 객채를 생성한것

		Person kim= new Person(); //스케너 선언과 똑같은 방식, 다만 스케너는 자바에서 만들어서 제공하는것, 지금은 퍼슨이란 데이터 타입을 만들고 지금만듬
		Person lee = new Person();  // Person 이런것을 생성자 컨스트럭터라고 한다. 
									// 클레스의 이름은 똑같은데 뒤에 가로가 들어가는게 다르다. 
									// 가로가 들어간다는것은 메소드 , 함수라는 이야기 
									// 클레스의 생성자는 그 클래스의 이름과 동일한 특별한 용도의 메소드 - 특수목적의 메서드를 생성자라고 한다. 
		Person kim2 = new Person(1, "01047575941", "김값돌");
		

		
		
		
		
		// 생성된 객체에 변수를 조작
		// kim.name = "김갑돌";      //김객채가 가진 속성들
		kim.setName("김갑돌");
		//kim.address = "청주시 흥덕구";
		kim.setAddress("청주시 흥덕구");

		System.out.println(kim.getAddress());
		
		
		kim.showinfo();    //전에 만든 쇼인포 메소드 
		
		
		
		
//		lee.name = "이순신";
//		lee.address = "충주시 봉방동";
//		lee.showinfo();   //같은 쇼 인포지만 서로다른 내용이 출력됨. 
//		
//		
	}

}


// 클래스의 개념
// 클래스 이용, 객체 생성하기 
//접근 한정자(엑세스 모디파이어) - 정보 은닉(information hiding)
// getters & Setters
// 생성자 constructor
