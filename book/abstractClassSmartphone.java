package com.java.november.book;

public class abstractClassSmartphone extends abstractClassPhone{
	
	public abstractClassSmartphone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
