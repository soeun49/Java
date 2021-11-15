package com.java.november.book;

public abstract class abstractClassPhone {
	
		public String owner;
		
		public abstractClassPhone(String Owner) {
			this.owner=owner;
			
		}
		public void turnOn() {
			System.out.println("폰 전원을 켭니다");
		}
		public void turnOff() {
			System.out.println("폰 전원을 끕니다.");
		}

}
