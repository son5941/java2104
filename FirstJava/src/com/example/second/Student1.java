package com.example.second;

public class Student1 {

	//교재 184
	
	public static int serialNumber = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	
	public Student1() {   //생성자는 클레스 이름과 똑같아야 한다. 
		serialNumber ++;
		studentID = serialNumber;
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
}
