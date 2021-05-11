package com.example.second;

public class Factory {

	
	public String facName;
	public int facCnt;
	
	public void produce() {         //생성자는 만드는것! 메소드 
	   Company.comCnt++;
	   this.facCnt++;    //위에것과 다른게 자기 클레스에서????
	   Factory woolsan = new Factory();
	   
	}
	
	public void showinfo() {
	System.out.println(facName + "공장의 생산량 : " + facCnt);
	}
	
	
}
