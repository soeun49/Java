package com.java.november.book;

public class Array {

	public static void main(String[] args) {
//		Ex1();
		Ex2();

	}
	private static void Ex1() {
		int [] scores= {83,90,87};
		int sum=0;
		for (int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("����: "+sum);
		
		double avg=(double)sum/scores.length;
		System.out.println("���:" + avg);
	}
	private static void Ex2() {
		//���� for��
		int [] scores= {95,71,84,93,87};
		int sum=0;
		for (int score:scores) {
			sum=sum+score;
		}
		System.out.println("���� ����:"+sum);
		
		
		double avg= (double)sum/scores.length;
		System.out.println("���� ���=" + avg);
	
	}

}
