package com.example.second;

   //페러미터 : 넘겨주고 받고 하는 것. ex) 커피를 사오기 위한 행위한 재료를 공급하는데 그것을 페러미터 혹은 인수!
   // 함수를 통해 돌려주면 리턴 안돌려주면 보이드. 



public class Bus {
	int busNumber;
	int passengerCount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	public void take(int money) {  //void는 돌려받는것이 없어서 타입 지정을 안해도 되는상황.  .int money 는 명칭을 바껴도 된다. 
		this.money += money;       //페러미터로 받은 머니 - 나를 호출한 쪽에서 준돈 
		
		this.passengerCount++;   // 내클래스 안에 임으로 접근할수 있는 속성. 
	}
	
	public void takeoff() {
		this.passengerCount --;
	}
	
	
	
	public String showinfo() {
		return this.busNumber+ "번 버스 현재 승객 수: " + this.passengerCount + ", 금액은 : " + this.money;
	}
	
	
}
