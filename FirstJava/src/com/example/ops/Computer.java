package com.example.ops;

public abstract class Computer {

	// 함수의 본체 없이 메서드를 선언함. 추상메서드 
	// abstract 를 선언하려면 클레스에도 abstract 선언해야함. 
	
	public abstract void display();
	                            // {}본체부분 없이 선언되어진 함수. 
								// abstract 를 선언해주고 
								//구체적인 내용 선언을 안하고 내요정의할 수 있다. 
	                            // 대가로는 함수(메서드)의 본체, 함수의 본체 없이 함수를 선언 ==> 추상메서드라고 함. \
								// 이단계에서 메서드를 정의를 해놓지 않는다. 대신은 이름만큼은 정의해둔다. 
								// 이름은 통일하되 하위클레스에게 맡겨놓을때
								
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("컴퓨터 전원켭니다. ");		
	}
	public void turnff() {
		System.out.println("컴퓨터 전원끕니다. ");
	}
}


