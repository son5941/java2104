package com.example.second;

public class BusTest {

	public static void main(String[] args) {    //실제 돌아가야해서 메인 메소드로 만듬.
		// passenger, bus 클래스 사용, 객체의 상호작용 확인
		// 객채간의 상호작용이란 클래스 내에서 다른 클래스 내의 메소드를 호출하는 형태로 이뤄진다. 
		// 배열타입 추가 삭제, 업데이트가 되어지게 하는 개념= 컬랙션 데이터 타입 
		
		Passenger kim = new Passenger("김길동", 50000);
		
		Passenger lee = new Passenger("이몽룡", 10000);
		
		Bus bus407 = new Bus(407);
		Bus bus408 = new Bus(408);
		
		
		System.out.println(kim.showmoney()); //버스 탑승전 김의 지갑 확인
		
		kim.takebus(bus407); //버스 탑승
		lee.takebus(bus407); // 버스 탑승
		System.out.println(bus407.showinfo());
		
		
		kim.takeoff(bus407); // 버스 내림
		
		
		System.out.println(kim.showmoney()); // 탑승 후 kim의 지갑 확인
		
	    System.out.println(bus407.showinfo()); // 승객을 태운 후 버스 돈박스 확인
	    
	    

	} //end of main

} // end of class
