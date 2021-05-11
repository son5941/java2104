package com.example.third;

import java.util.ArrayList;
public class ArrayLisiTest {

	public static void main(String[] args) {
		 // ArrayList 를 활용한 배열 선언
		ArrayList<Book> library = new ArrayList<Book>();
		
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "조정래"));
		library.add(new Book("아리랑", "조정래"));
		library.add(new Book("폭풍의 언덕", "조정래"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.ShowBookInfo();
			
		}
		
		System.out.println("for each문....");
		for(Book book : library) {
			book.ShowBookInfo();
		}
	}

}
