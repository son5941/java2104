package com.example.second;

public class Companytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Company hy = new Company();
		hy.name = "현대";
		
	    Factory f1  = new Factory();
	    f1.facName = "울산";
	    
	    Factory f2 = new Factory();
	    f2.facName = "청주";
	    
	    hy.showCount();
	    f1.showinfo();
	    f2.showinfo();
	    
	    f1.produce();
	    f1.produce();
	    f1.produce();
	    f2.produce();
	    f2.produce();
	    
	    System.out.println("after produce");
	    hy.showCount();
	    f1.showinfo();
	    f2.showinfo();
	    
	}

}
