package com.example.second;

public class Scope {

	//스텍틱 변수, 맴버 변수, 지역변수 
	
	
	
	static int number = 0;   //클레스에서 선언하는 넘버는 아무곳에서나 사용할 수 있다. 
	                         // 스테틱 변수/혹은 클레스 변수  - 이 변수는 데이터 영역안에서 만들어지기 때문에 바로 사용할 수 있다.
	
	
	int number2 = 0;  // 이것은 맴버 변수 이고 스코프로부터 객채게 만들어진 데에서만 활용이 될 수 있다. 
	                  //클레스로부터 인스턴스 변수가 만들어질 때만 활용 (맴버 변수 혹은 인스턴스 변수)
	
	
	public static void main(String[] args) {

	System.out.println(number);	
		
	}
	
	public void f1() {
		
		// local variable 지역 변수 
		
		
		
		int number = 0;   //이 변수는 함수 안에서만 만들어졌기에 이것에만 영향을 미친다. 
		number ++;
		
		System.out.println(number);
	}
	

}
