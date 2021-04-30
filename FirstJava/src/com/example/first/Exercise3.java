package com.example.first;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// 사용로 부터 두개의 숫자를 입력 받아 숫자 합계를 홀/짝수의 구하시오.
		// 홀수 : odd number, 작수 : evernumber
		// for루프 사용 ( 시작; 종료건체크; 증감 식)
		// for(int i=n1; i<n2;i++)
		//   if(홀작판단){홀수의 합계, 짝수의 합계를 변경해라)
		// 숫자의 약수를 구하여 출력해보라. 
		
		int numb1;
		int numb2;
		int evensum = 0, oddsum = 0; //누계 구하는것은 초기값을 0으로 잡아라. 

		Scanner read = new Scanner(System.in);     //이것은 하나만 해도 된다. 
		System.out.println("첫번째 숫자를 입력하시오");
		numb1 = read.nextInt();

		System.out.println("두번째 숫자를 입력하시오");
		numb2 = read.nextInt();

		for(int i = numb1 ; i <= numb2 ;i++) {   //숫자 i를 num1부터 num2까지 1씩 증가한다.)
			if(i % 2 == 0)evensum += i;
			else oddsum += i;
		}  //end of for
		
		System.out.printf("%d ~ %d 중 홀수의 합은 %d, 짝수의 합은 %d", numb1 , numb2, evensum, oddsum );
		System.out.println(evensum);
		System.out.println(oddsum);

	} //end of main()

}// end of class