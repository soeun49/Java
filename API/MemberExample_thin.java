package com.java.november.API;
//thin clone (���� ����) 
public class MemberExample_thin {

	public static void main(String[] args) {
		
		//���� ��ü ����
		Member_thin original = new Member_thin("blue", "ȫ�浿","12345", 25, true);
		
		//���� ��ü�� ���� �Ŀ� �н����� ����
		Member_thin cloned = original.getMember1();
		cloned.password="54321";
		
		System.out.println("[���� ��ü�� �ʵ尪");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: "+ cloned.password);
		System.out.println("age "+ cloned.age);
		System.out.println("adult: "+ cloned.adult);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");		
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: "+ original.password);
		System.out.println("age "+ original.age);
		System.out.println("adult: "+ original.adult);

	}

}
