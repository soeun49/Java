package com.java.november.API;

import java.util.Arrays;

//deep clone (���� ����) 
public class Member_deep implements Cloneable {
	
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	
	public Member_deep(String name, int age, int[] scores, Car car) {
		this.name=name;
		this.age=age;
		this.scores=scores;
		this.car=car;

	}
		
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		//���� ������ ���ؼ� name,age�� ����
		Member_deep cloned=(Member_deep)super.clone();
		
		//scores�� ���� ������
		cloned.scores=Arrays.copyOf(this.scores, this.scores.length);
		
		//car�� ���� ����
		cloned.car=new Car(this.car.model);
		
		//���� ������ Member ��ü�� return
		return cloned;
	}


	public Member_deep getMember2() {
		Member_deep cloned=null;
		try {
			cloned=(Member_deep)clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;

}
}