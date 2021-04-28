package com.example.first;

public class ControlFlow4 {

	public static void main(String[] args) {
		// 문제가 1부터 10까지의 숫자 합계를 구하여 출력하시오. 
		// 1. 준비  : number=1, sum=0,
		
		//int number = 1, total =0; 
		//int total = number + total;
		         
		//while(number<11 ) {
		
		// 누계 :  sum + num 기존에 있는것에다 더하기를 계속하는것
		        // sum은 초기값을 0으로 잡는다. 
		
		// 누적 : 곱하기, 누승이라고 이야기함. 
				// 누승을 한다면 초기값은 1이 되야 한다. 
		
		
		  int number=1, sum=0; 
		  
		  while(number<11) {
			  sum= sum+number;   // sum += num
			  number++;          // number를 숫자를 1씩증가한다. 2가되서 와일로 다시 올라간다. 
		  }
	
		
		
		System.out.printf("결과값 : %d\n", sum);
		
		// 2. 숫자가 11보다 작은동안 반복 
		// 2.1 sum : sum+ number
		// 2.2 number ++
		// 2.3 sum += number
		// 2.4 number++
		// 3. 합계 출력
		// 4. 프로그램 종료
		
		
		
		
		
	}

}
