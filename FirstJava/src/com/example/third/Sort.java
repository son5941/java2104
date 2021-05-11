package com.example.third;

public class Sort {

	public static void main(String[] args) {
		// 소팅 배열 사용
		// 배열 하기 
		
		int[] arr = { 3, 4, 2, 1}; // 기준점을 잡고 비교점을 잡는다. 기준점이 비교점보다 크면 자리를 바꿔준다. 
		             // 자리교환을 하려면 중간에 템프러리 공간을 만들고 - 하나 빈공간을 만들어서 해야함. 
					// 첫자리부터 기준점을 잡아주고 비교점과 비교해 제일 작은것을 
		            //1, 4
		int temp;
		
		
		for( int base = 0; base < arr.length; base++) {
			for(int compare = base + 1;compare < arr.length; compare++) {
				if (arr[base] > arr[compare]) {    // 등호 방향만 바꾸면 내림차순, 오름차순으로 바뀔 수 있다. 
				  temp = arr[base];  //swap
				  arr[base] = arr[compare];
				  arr[compare] = temp; 
				}
			}
		
			for(int num :  arr) {
				System.out.printf("%3d", num);
			}
			System.out.println();
			
		} 
		
		
		 
	}//end of main

} // end of class
