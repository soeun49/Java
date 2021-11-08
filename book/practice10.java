package com.java.november.book;

//예외처리

public class practice10 {
	
	public static void main(String[] args) {
//		EX1();
	}
	private static void EX1() {
		try {
			Class clazz = Class.forName("java.lang.String2");		
		}catch (ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
			
		}
		
	}


}
		




