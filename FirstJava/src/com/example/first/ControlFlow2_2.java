package com.example.first;

import java.util.Scanner;

public class ControlFlow2_2 {

	public static void main(String[] args) {
		// if ~ else if문을 확인했습니다. 
		//로직이 길어지다 보면 
		// switch ~ case 문 스위치 값이 얼마일때 
		// if(score == 99 || score ==98 || score==97||)  어떠한 값에 매치되는 것을 비교할 경우 
		// 중가로를 많이 쓰는 상황을 피하기 위해서
		// switch(score) {
		// case 99:
		// case 98:
		// case 97: {실행할 문장을 적어준다.}
        // 스취일경우 작업선택을 할때, 들어오는 값이 정확하게 들어오기때문에 스위치 케이스로 처리한다. 보기에도 깔끔하고 정확하게 할 수 있다.
		
	    
	    char  job;
	 
		System.out.println("I.자료 입력, M.수정, D.삭제, S. 조회, E. 종료");
		System.out.println("작업 번호를 선택하세요");
		Scanner read=new Scanner(System.in);
		
		job = read.next().charAt(0);   //0번재 인덱스를 글자로 뽑아라. 스트링을 케릭터로 변환해서 스케너 하는 방법!
		
		
		
		//		if(job =="1") {
		//			System.out.println("입력처리를 진행합니다. ");
		//		}else if(job =="2") {
		//			System.out.println("수정처리를 진행합니다. ");
		//		}else if(job =="3") {
		//			System.out.println("삭제처리를 진행합니다. ");
		//		}else if(job =="4") {
		//			System.out.println("조회처리를 진행합니다. ");
		//		}else {
		//			System.out.println("other");
		//		}
		//		
		//		System.out.println("프로그램 종료...");
		
		switch(job) {      // 중요중요  스위치는!!! 숫자 or 앞에 한글자만 인식함 때문에 int of char 밖에 안됨. 
		//이렇게 실행할경우 케이스 전부가 프린트 된다. 
		// 이 블록을 벗어나야 한다. break;
		// 스위치 케이스 할 경우 마지막으로 반드시 break를 적어줘야만 의도한것을 제외하고 처리하고 빠져 나올 수 있다. 
		
		case 'I', 'i':
			System.out.println("입력처리를 진행합니다");  
			break;
			
		case 'M', 'm':
			System.out.println("수정처리를 진행합니다");
			break;
		case 'D', 'd':
			System.out.println("삭제처리를 진행합니다");
			break;
		case 'S','s':
			System.out.println("조회처리를 진행합니다");
			break;
		default:
		    System.out.println("others...");
		
		} //end of switch
		System.out.println("프로그램 종료합니다."); 
		
		// case는 문자로도 대신할 수 있다. 
	}

}
