package com.example.first;

 

public class Person {
	
	  // 메인 메소드가 없음. 
	// member 변수   - 둘은 선택적이다. 둘해도 되고 하나만 해도 되고
	// 맴버 변수는 - fields, attriubutes 사용한다. 
	// 클래스에서  객체의 정적 특성을 표현할 수 있는데이터 
	// 클레스 제목은 대문자.
	
	int srid; //주민등록 번호 // default 로 되어 있어 같은 페키지 안에서는 들어올 수 있음. 
	private String name;   //특정한 이유에서 정보를 감춰야 한다. 정보은닝(필요한 정보는 감추고 외부에다 노출을 안시키겠다)
	private String phone;   // 허가되어진 통로로 들어갈수 있는데 그것을 값을 가지고 가는것을 개터, 변경하는 통로를 섹터라고 한다. 
	private String address;
	
	
	//디폴트 생성자 - 자동으로 자바가 만들어줌 
	// 기본 생성자 
	public Person() {
		//none operation
	}   
	//얘를 만들지 않더라도 자바 프로그램이 만들어줌. 
	// 지금 수행하는것은 없으나 person 이라는 자료를 기억공간에 만드는것. 
	
	public Person(int srid, String name, String phone) {
		this.srid = srid;
		this.name = name;
		this.phone = address;
		
	} //사용자가 만든 정의가 있으며.
	
	
	
	public void setName(String name) {     //개터(값을 가지고 오는것)와 섹터는 퍼블릭으로 만들어야 함. 나의 이름값을 바꾸겠다. 
	  
		 this.name = name ;  //이속성값을 외부에서 받은값으로 대체 할수 있다. 
	}   // 이것을 섹터라고 함. 
	
	public void setAddress(String address) {  // 정보보호를 위해서 필요에 의해서 private에 접근하기 위한 허가된 통로를 셋터라고 한다. 
		this.address = address;

	}

	public String getAddress() {  // 정보보호를 위해서 필요에 의해서 private에 접근하기 위한 허가된 통로를 셋터라고 한다. 
		return this.address;
	}
	
	
	
	// member methods
	// 객체의 동적(움직임) 특성을 표현
	// 잠을 잔다, 밥을 먹는다, 뛰어 다닌다. 등 움직임, 기능과 관련된, 동적 특성
	// 함수 정의 하는 방법과 동일
	// 타입 함수이름(매개변수){.....; return 반환값;(이것은 선택적인것)  }  ex) 일어나세요, 일어나서 테이블에 쓰고 전달해주세요. 이때 return을 사용한다. 
	// 값을 돌려주는게 없을 경우 return 활용.  돌려주는게 있는 경우 타입에 적어준다. 
	// 액세스 모디 파이어(접근 한정자 - 쉽게 예기하면 퍼블릭, 프로텍트, 파리이빗 이런것이냐)
	// 한정자는 적어줄 수 있고 생략할 수 있다. 
	
	public void showinfo()  {   //돌려줄 타입이 없다 void, 쇼인포는 내가가진 변수를 보여주는 타입이라고 생각하고 만든다. 
		System.out.println("이름:" + name + ", 주소:" + address);
	}
	
	Person returnItself() {
		return this;    //해당 객체의 주소값을 반환한다. 
	}
	
	
	
	
	// 지금까지 성형틀을 만든것 - 이제 성형틀로 물건을 만들어 보자 
	
 } //end of class
