package com.java.november.API;
//finalize() �޼ҵ� ���� Ȯ��
public class FinalizeExample {

	public static void main(String[] args) {
		 Counter counter = null;
		 for (int i=1;i<=50;i++) {
			 counter= new Counter(i);
			 
			 //counter ��ü�� ������� ����
			 counter=null;
			 
			 //������ ������ ���� ��û
			 System.gc();
			 
			 //���� �Ҹ��Ű�� �ʰ�, �޸𸮰� ������ ��, CPU�� �Ѱ��� �� JVM�� ���ؼ� �ڵ����� 
			 //������ ���� ������� �Ҹ��Ű�� �ʰ�, �������� �Ҹ��Ŵ 
		 }
		

	}

}
