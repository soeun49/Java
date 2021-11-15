package com.java.november.API;
//deep clone (깊은 복제) 
public class MemberExample_deep {

	public static void main(String[] args) {
		
		//원본 객체 생성
		Member_deep original = new Member_deep("홍길동", 25, new int[] {90,85}, new Car("Tiguan"));
		
		//복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member_deep cloned = original.getMember2();
		cloned.scores[0]=100;
		cloned.car.model="Sonata";
		
		System.out.println("[복제 객체의 필드값");
		System.out.println("name: " + cloned.name);
		System.out.println("age "+ cloned.age);
		System.out.print("scores: {");
		for (int i=0;i<cloned.scores.length;i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " +cloned.car.model);
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");		
		System.out.println("name: " + original.name);
		System.out.println("age "+ original.age);
		System.out.print("scores: {");
		for (int i=0;i<original.scores.length;i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " +original.car.model);

	}

}
