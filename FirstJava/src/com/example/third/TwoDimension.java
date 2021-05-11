package com.example.third;

public class TwoDimension {

	public static void main(String[] args) {
		// 이차원 배열
		
		
		int [][] arr = {{1,2,3},{4,5,6}};
		
		for(int i =0; i < arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {  //arr i번재 보다 작은동안 하나씩 증가시킨다. 
				System.out.printf("%3d", arr[i][j]);
			}
		
			System.out.println();
		} // end of outer for

	} // end of main

} // end of class
