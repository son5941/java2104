package com.example.ops;

public class Calctest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		
		Calc2 calc = new Calc2();  //Calc2에 클레스에서 가져온 정보로 만든 calc 
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.ShowInfo();
		
		
		
		
	}

}
