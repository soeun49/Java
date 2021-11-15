package com.java.november.API;
//thin clone (æ„¿∫ ∫π¡¶) 
public class Member_thin implements Cloneable {
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member_thin(String id, String name, String password, int age, boolean adult ) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.adult=adult;
	}
	
	public Member_thin getMember1() {
		Member_thin cloned=null;
		try {
			cloned=(Member_thin)clone();
		}catch(CloneNotSupportedException e) {
	}
		return cloned;

}
}