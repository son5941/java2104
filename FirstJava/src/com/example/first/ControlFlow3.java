package com.example.first;

import java.util.Scanner;

public class ControlFlow3 {

	public static void main(String[] args) {
		// 반복처리 방식
		//      손님이 여러명일때 
		
		//문제  : 생년을 입력받아 나이를 계산하여 
				//  다음처리를 반복하라. 생년이 0이 아닌동안
				//        나이를 입력받아 계산하고 
				// 		  미성년이면 '가세요'
				// 		  성년이면 '들어오세요'를 출력하는 것을 반복하는 프로그램을 작성하시오 . 
				
		       // 1. 준비 단계
		
				
				Scanner read=new Scanner(System.in); //new 생성자를 호출한다. 객체를 만들어서. 
				                                     //scanner이건 생성자 왜냐면 클레스 이름과 메소드 이름이 같아서
				
				int baseYear=2021, birthYear=9999, age ; // 지금 잡아두지 않으면 다음 while값이 없기때문에 데이터가 없기때문에 .미리 넣어둔다. 
															// 9999는 값이 없으면 오류가 생겨서 다음 코딩에 넣어둔다. 
															//9999는 발생하지 않는 값을 넣어둔다. -1로도 넣을수 있다. 
				
				
				// 2. 나이가 0이 아닌 동안 다음을 반복하시오 
                // while, for = ~하는 동안
				while(birthYear != 0) {   					  //!= 0이 아닌동안)
					System.out.println("생년월일을 입력하세요");
					// 2.1 사용자로부터 생년을 입력받는다. 변수에 대입한다.
					birthYear = read.nextInt();
					
					//입력된 연도가 0이면 그냥 끝내도록
					// 코드 추가 보완
					
					if (birthYear == 0) break; // break 는 반복되어진 루프에서 벋어난다. 반복문(while, for을 사용할때)을 벋어나는 것을 브레이크
					                           // 브레이크는 밑으로 벋어난다. 
					                           // 다시 올라가야 하는 경우가 있는데 이는 continue를 사용한다. 
					
					// 2.2 나이를 계산한다. 
					age= baseYear - birthYear;
					// 2.3 미성년이면 '가세요', 
					// 성년이면 '오세요'를 출력하자. 
					
					if(age<20) {
						System.out.println("가세요");
					} else {
						System.out.println("오세요~");				
					}
				} //end of while
				
				//3. 프로그램을 종료하고 메시지 출력하고 종료
				System.out.println("프로그램 종료");
								
				
				// 문제점 생년월일0
	
				
				
				
	} //end of main

} //end of class
