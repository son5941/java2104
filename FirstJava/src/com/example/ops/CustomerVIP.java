package com.example.ops;

public class CustomerVIP extends Customer {
	
	
	//기존에 있는 클레스를 기능확장하는 차원에서 진행한다. 
	// 이런것을 상속받는다. 이다. 
	// 커스터머가 가지고 있는 모든 것을 가져다 쓸수 있다. 
	
	// 내 위에 있는 개념을할때 super을 사용한다. 
	// VIP 고객과 일반고객의 차이점을 부각시킨다. 
	
	private int agentID; //vip는 전담을 붙여준다. 
	double saleRatio; //할인을 다르게 해준다. 
	
	public CustomerVIP() {
		super();   //의도적으로 감지할 때 슈퍼 사용 , 명시적으로 상위클래스 생성자 호출 
		
		//상위클레스의 속성을 변경하고 싶을때는 super. 으로 시작한다.- 특정한 메소드 지정하고 동작을 시킬때  
		
		System.out.println("********");

		customerGrade = "VIP";
		// super.setCustomerGrade("VIP");  // 첫번째 호출하는 방법 상위 클레스에서 가져옴. 이건 Private 상태일때 사용할 수 있다. 
		
			
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		bonusPoint = 0;
		System.out.println("VIP 커스터머 생성자 호출");
		
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	@Override
	public int calcPrice(int price) {   // 계산 금액을 넣어야 한다. 구매금액을 페러미터 타입으로 받아서. 
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);   // 정수형으로 변환해 처리                     //int 타입이 들어가면 반드시 돌려주는 값이 있어야 한다. 
	}
	
	
	

}
