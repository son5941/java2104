package com.example.ops;

public class CustomerTest {
			//모든 클레스는 상위클레스가 먼저 한번 돌아져야 하위클래스가 돌수 있다. 
	
	
	
	public static void main(String[] args) {
		Customer kim = new Customer();   //생성자에서 가저오는것
		kim.setCustomerID(1);   //김씨의 아이디는 1번이다.
		kim.setCustomerName("김갑돌");  // 이름은 김갑돌 - 샛터값에서 가져오는것. 
		System.out.println(kim.calcPrice(10000)+"원 지불 완료");
		kim.showCustomerInfo();   //출력이 아니라 리턴해서 보내준것. 
		System.out.println(kim.showCustomerInfo());
		

		CustomerVIP lee = new CustomerVIP();   //커스터머 VIP에서 가져온것. 
		
		lee.setCustomerID(2);
		lee.setCustomerName("이몽룡");
		System.out.println(lee.calcPrice(10000)+ "원 지불 완료");
		System.out.println(lee.showCustomerInfo());
		
		
	} //end of main

}  //
