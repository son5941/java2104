package com.example.second;

public class Student1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 stdlee = new Student1();
		stdlee.setStudentName("이몽룡");
		System.out.println(stdlee.studentID);
		System.out.println(stdlee.studentName);
		
		
		Student1 stdHong = new Student1();
		stdHong.setStudentName("홍길동");
		System.out.println(stdHong.studentID);
		System.out.println(stdHong.studentName);
		System.out.println(Scope.number);   //스코프 클레스에서 가져온 변수 
		
	}

}
