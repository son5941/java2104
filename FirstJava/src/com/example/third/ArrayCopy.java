package com.example.third;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(arr1, 2, arr2, 3, 2);  // 어레이 원에 2번 인덱스부터 어레이투의 3번 인덱스를 두번 복사하겠다. 
		                                        // 어레이 2에는 1,2,3,30, 40이 카피되어 들어온다. 
		
		for(int n : arr2) {
			System.out.println(n);   //어레이 2를 10으로 
			
		}
		
		

	}

}
