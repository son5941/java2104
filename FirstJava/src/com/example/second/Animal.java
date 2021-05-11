package com.example.second;

public class Animal {
  
   public String name;
   //public static int count = 0 ; //인트로 초기값 0
   public  int count = 0 ; //인트로 초기값 0
 
   public Animal() {    //생성자 클레스 이름과 똑같이 만들어지는것. 에니멀 생성자가 돌아갈대마다 카운트를 하나씩 증가한다. 
	   this.count++;   //카운트 변수가 인스턴스 변수를 공유한다. 
	   
   }
   
   
   public void run() {
	 System.out.println(name + "이(가) 달려요...");   
   }
   // public void static showcount() {
   //	   System.out.println(count);    //

   public void showcount() {
	   System.out.println(this.count);    //이렇게 하니까 카운트가 공유가 안됨. 
	   
	   
   }
	 
	
}
