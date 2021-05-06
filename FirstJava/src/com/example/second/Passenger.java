package com.example.second;

public class Passenger {
		// 승객 클래스 
	
	 private String name;
	 private int money;
	 
	 
    public Passenger() {   //디폴트 값을 만든다. 
    	this("무명씨", 0);  //승객을 만들면서 이름을 안주면 이렇게 들어감. 
    }
	 
	public Passenger(String name, int money) {   //클래스 이름과 같은 생성자 - 컨스트럭터 만들기  (오른쪽 버튼 - 소스 - 제너레이트 컨스트럭터 필드 클릭)
		super();                                  // 사용자가 새롭게 정의한 생성자에서 슈퍼는 부모클레스의 생성자를 호출하는것
												// 오브젝트 클레스라는 기본에서 파생되는것 그 클래스를 호출하는것. 	
		this.name = name;
		this.money = money;
	}

     // 개터와 섹터 만들기 오른쪽 - 소스 - 개터섹터

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}
	 
	public void takebus(Bus bus) {    //함수 돌려줄게 없으니까 void, 데이크 버스에 디파인 없지만 몇번버스를 탈거야 지정해야 하니까 
		this.money -= 1000;  //나의 지갑에서 천원을 뺀다. 
		///bus.money += 1000; 버스의 머니도 천원만큼 증가한다. 
		bus.take(1000);  //승객을 테우는데 1000자리 만큼 태운다. 해당버스의 돈박스에 1000원을 증가
		
	}
	
	public void takeoff(Bus bus) {   

		bus.takeoff();  //
		
	}
	
	
	public String showmoney() {
		return this.name + "님의 현재 잔액 : " + this.money;
	}
	 
	
	
}
