package com.example.ops;

public abstract class Desktop extends Computer {
			
			//앞에서 abstract를 해놓으라고 했고 
	 		// 디스플레이와 타이핑은 추상적으로 만들어놨으니까 오버라이딩 되어있다. 
			
	
			
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display in desktop");
	}

	// 상속받은것 중에서 typing 메서드는 여전히 구현하지 않은 상태이다. 
	// 
	public abstract void typing();  //이게 엡스트렉트 메서드이기때문에 클레스에 abstract 추가 

}
