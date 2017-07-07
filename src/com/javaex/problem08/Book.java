package com.javaex.problem08;

public class Book {
	//books[0] = new Book(1, "트와일라잇", "스테파니메이어");
	private int bookNo;
	private String title, author;
	private int stateCode;

	public Book(int bookNo, String title, String author) {
		// TODO Auto-generated constructor stub
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
    
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void rent(int bookNo) {
		System.out.println(title+"이(가) 대여됬습니다.");
		stateCode = 0;
	} 
	public void print(Book book) {
		if(stateCode == 0) {
			System.out.println(bookNo+"책 제목 : "+
		title+", 작가 : "+author+", 대여 유무 : 대여 중");
		} else if(stateCode == 1) {
			System.out.println(bookNo+"책 제목 : "+
		title+", 작가 : "+author+", 대여 유무 : 재고 있음");
		}
	}
    
}
