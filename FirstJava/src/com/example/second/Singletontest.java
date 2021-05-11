package com.example.second;

public class Singletontest {

	public static void main(String[] args) {

		
		Singleton c1 = Singleton.getInstance();
		Singleton c2 = Singleton.getInstance();
		System.out.println(c1);   //c1과 c2가 싱글톤에서 인스턴스 객체를 스테틱으로 하나 하였기 때문에 하나만 만들어진다. 
		System.out.println(c2);   // 이러한 것을 싱글톤 페턴이라고 이야기한다. 
		
	}

}
