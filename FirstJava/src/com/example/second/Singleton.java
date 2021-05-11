package com.example.second;

public class Singleton {

	private static Singleton instance = new Singleton();  //이것은 프라이빗 타입으로 스테틱
	
	
	private Singleton() {
		
		
	} // end of default constructor
	
	
	public static Singleton getInstance() {   //싱클톤 타입으로 
	
	if(instance == null) {
		instance = new Singleton();
		
	}
	 return instance;
	 
	}
	
	
}// end of class
