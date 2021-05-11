package com.example.second;

public class AnimalTest {

	public static void main(String[] args) {   //프로그램을 돌릴대 메인 메소드 
		
		// 에니멀의 변수에 접근
		
		// Animal.name = "강아지";  //왜 접근이 안되면 에니멀의 클레스로부터 객체가 만들어져야만 들어가는 것
		// 객체가 생성되었을때만 유효한 instance 변수,  인스턴스 메서드 
//		Animal dog = new Animal();   //에니멀 클래스에서 객체를 만들었을때 역할을 한다. 이런것을 인스턴스 변수 
//		
//		dog.name = "워리";
//		dog.run();
//		
		
		//아래는 객체가 만들어지지 않았음에도 돌았다. 
//		Animal.showcount();
//		Animal.count ++;
//		Animal.showcount();

		Animal dog = new Animal();
		dog.showcount();             //static을 통해 count변수를 공유하고 있다. 
		Animal cat = new Animal();
		cat.showcount();
		
		

	}

}
