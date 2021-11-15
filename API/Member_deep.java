package com.java.november.API;

import java.util.Arrays;

//deep clone (깊은 복제) 
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
		
		//얕은 복제를 위해서 name,age를 복제
		Member_deep cloned=(Member_deep)super.clone();
		
		//scores를 깊은 복제함
		cloned.scores=Arrays.copyOf(this.scores, this.scores.length);
		
		//car를 깊은 복제
		cloned.car=new Car(this.car.model);
		
		//깊은 복제된 Member 객체를 return
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