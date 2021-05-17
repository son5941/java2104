package com.example.ops;

public interface Calc {

	
	// 이안의 변수는 전부다 파이널 변수 
	// 메서드는 전부 abstract 변수이다. 
	// 모든 메서드를 전달하고 리스팅만 하고 하청을 제공함. 
	
	
	double PI = 3.24;
	int ERROR = -99999999;
	
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
