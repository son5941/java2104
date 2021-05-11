package com.example.third;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double subject[][] = {
				{70., 80., 90., 0., 0.},  //국영수 총점 평균
				{50., 60., 50., 0., 0.},  
				{50., 20., 30., 0., 0.},
				{0., 0., 0., 0., 0.},  //과목 총점
				{0., 0. , 0. , 0. , 0.}    // 과목 평균
		};
		
	
		for(int i=0; i<3; i++) { //행(학생)변경     
			for(int j=0 ; j<3 ; j++) { //(열 (과목 변경))
			subject[i][3] += subject[i][j];   //개인 총점 누적    0행 0,1,2열
			subject[3][j] += subject[i][j];   //과목 총점 누적  - 고정된 3행에다가 j열을 넣어라. 
			subject[4][j] = subject[3][j] / 3.0;  //과목 평균 계산
			
			}
		subject[i][4] = subject[i][3] /3.0;   //개인 평균 i행의 4열에다가 계산 i행의 3열/3.0을 넣어라 
		
		}
		
		for(int i = 0; i <5 ; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%8.1f", subject[i][j]);
			}
			System.out.println();
			
		}
		
	}

}
