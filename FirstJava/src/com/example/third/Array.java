package com.example.third;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {

		//배열 선언
		//
		//.자료형 [ ] 배열의 이름 = new 자료형[배열의 크기, 갯수 ]
		//
		//.자료형 배열이름[ ]  =  new 자료형 [배열 크기, 갯수 ]
		//
		//int [ ] arrey = new int [ 3 ]    //arrey이름으로 arrey 1, arrey2, arrey 3로 만들어짐
		//arrey[0] = 1; 배열의 첫번째를 1으로 주겠다. 
		//arrey[2] = 2; 배열의 3번째를 2로 주겠다. 
		//
		//int arrey[ ] =  new int[3];  //위에것과 같은것
		//
		//
		////배열 선언과 동시에 초기화는 방법
		//
		//int [ ] arrey = new int [  ]{ 직접 데이터값을 넣을 수 있다; 
		//예를 들어 int [ ] arrey = new int [  ]{ 1,2,3,4,5} 는 [가로 안에 5개 변수를 넣을 수 있다. 
		
		Scanner read = new Scanner(System.in);
		
//		배열 선언 후 초기화 
//		
//		int [] arr = new int[5];
//		for(int i=0; i<5; i++ ) {
//			System.out.println(i+1 + "번째 숫자를 입력하세요");
//			arr[i] = read.nextInt();
//			//System.out.println(arr[i]);  //배열 선언과 동시에 1~5까지 집어 넣어 주는것. 
//		}
		
		
		//배열 선언과 동시에 초기화 
		
		int[] arr = new int[] {1,2,3,4,5, 1,1 ,1};
		
		for(int i = 0; i < arr.length ; i++) {   //arr.length - 어레이의 랜스만큼. 
			
			System.out.printf("%d", arr[i]);
			
		}
		System.out.println();
		
	}

}
