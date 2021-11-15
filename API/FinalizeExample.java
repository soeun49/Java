package com.java.november.API;
//finalize() 메소드 실행 확인
public class FinalizeExample {

	public static void main(String[] args) {
		 Counter counter = null;
		 for (int i=1;i<=50;i++) {
			 counter= new Counter(i);
			 
			 //counter 객체를 쓰레기로 만듬
			 counter=null;
			 
			 //쓰레기 수집기 실행 요청
			 System.gc();
			 
			 //전부 소멸시키지 않고, 메모리가 부족할 때, CPU가 한가할 때 JVM에 의해서 자동실행 
			 //실행결과 또한 순서대로 소멸시키지 않고, 무작위로 소멸시킴 
		 }
		

	}

}
