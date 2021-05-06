package com.example.second;

public class Person2 {
     private int money;
     private String name;
     private String address;
     
     public Person2() {
          this (0, "무명씨", "청주시");  	 
     }
     
     
     public Person2(int money, String name, String address)
     { this.money  = money;
       this.name = name;
       this.address =address;
     }
     
     
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
     
	
} // end of class
