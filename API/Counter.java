package com.java.november.API;
//finalize() �޼ҵ� ������
public class Counter {
	
	private int no;
	
	public Counter(int no) {
		this.no=no;
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
	

}
