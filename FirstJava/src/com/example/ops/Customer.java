package com.example.ops;

public class Customer {
	
	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint = 0;   //디폴트 엑세스 모디파이드 생략됨. 
	double bonusRatio;
	
	public Customer() {
	  customerGrade = "SILVER";  //무조건 기본등급은 실버등급. 생성자는 초기값을 제공한다. 
	  bonusRatio = 0.01;
	  
	}  // 생성자
	
	

	public int getCustomerID() {
		return customerID;
	}

			//보통 개터 섹터는 생성자 다음에 만드는게 일반적인 관례

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	

	public int calcPrice(int price) {   // 계산 금액을 넣어야 한다. 구매금액을 페러미터 타입으로 받아서. 
		bonusPoint += price * bonusRatio;
		return price;                       //int 타입이 들어가면 반드시 돌려주는 값이 있어야 한다. 
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은" + customerGrade + ", 보너스 포인트 : " + bonusPoint + "."; 
	}
	
} //
