package com.example.third;

public class BookTest {

	public static void main(String[] args) {

		
//		Book[ ] library = new Book[5];
//		
//		library[0] = new Book("태백산맥", "조정래");
//		library[1] = new Book("아리랑", "조정래");
//		library[2] = new Book("개미", "베르나르");
//		library[3] = new Book("데미안", "헤세");
//		library[4] = new Book("폭풍의언덕", "브론테");
//		
//		
////		for(int i = 0; i < library.length; i++) { 
////			library[i].ShowBookInfo();
////		}
////		
//		
//		for( Book book : library ) {  //같은 포루프인데 배열이거나 리스트이거나 하나하나를 끄집어 내는데 그것을 북이라고 하겠다. 
//			                          // 꺼낸것에대한 타임 Book 클레스 타입, 
//		
//		book.ShowBookInfo();   //이렇게 가져온게 북한권한권이다. 
//		                       // 이런것을 for each 타입으로 부른다. 
//		}
//	}


		
		Book[ ] library1 = new Book[5];
		Book[ ] library2 = new Book[5];
		
		library1[0] = new Book("태백산맥", "조정래");
		library1[1] = new Book("아리랑", "조정래");
		library1[2] = new Book("개미", "베르나르");
		library1[3] = new Book("데미안", "헤세");
		library1[4] = new Book("폭풍의언덕", "브론테");
		
		library2[0] = new Book();
		library2[1] = new Book();
		library2[2] = new Book();
		library2[3] = new Book();
		library2[4] = new Book();

		for(int i = 0 ; i < 5; i++) {
			library2[i].setBookName(library1[i].getBookName());
			library2[i].setAuthor(library1[i].getAuthor());
		}
		
		
		
//		for(int i = 0; i < library.length; i++) { 
//			library[i].ShowBookInfo();
//		}
		System.arraycopy(library1, 0, library2, 0, 5);
		
		
		
		for( Book book : library1 ) {  //같은 포루프인데 배열이거나 리스트이거나 하나하나를 끄집어 내는데 그것을 북이라고 하겠다. 
			                          // 꺼낸것에대한 타임 Book 클레스 타입, 
		
		book.ShowBookInfo();   //이렇게 가져온게 북한권한권이다. 
		                       // 이런것을 for each 타입으로 부른다. 
		
		
		}
		System.out.println("===========아래===============");
		for( Book book : library1 ) {  //같은 포루프인데 배열이거나 리스트이거나 하나하나를 끄집어 내는데 그것을 북이라고 하겠다. 
            // 꺼낸것에대한 타임 Book 클레스 타입, 

			book.ShowBookInfo();   //이렇게 가져온게 북한권한권이다. 
									// 이런것을 for each 타입으로 부른다. 
}
	
	
	}
		
		
		
}
