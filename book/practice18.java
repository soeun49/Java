package com.java.november.book;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;

public class practice18 {

	public static void main(String[] args) throws Exception {
//		EX1();
//		EX2();
//		EX3();
//		EX4();
//		EX5();
//		EX6();


	}
	private static void EX1() throws Exception {
		System.out.println("==�޴�==");
		System.out.println("1.���� ��ȸ");
		System.out.println("2.���� ���");
		System.out.println("3.���� �Ա�");
		System.out.println("4.�����ϱ�");
		System.out.println("�޴��� �����ϼ���");
		
		InputStream is = System.in;
		char inputChar= (char)is.read();
		switch(inputChar) {
		case '1':
			System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
			break;
		case '2':
			System.out.println("���� ����� �����ϼ̽��ϴ�.");
			break;
		case '3':
			System.out.println("���� �Ա��� �����ϼ̽��ϴ�.");
			break;
		case '4':
			System.out.println("�����ϱ⸦ �����ϼ̽��ϴ�.");
			break;
		}
		
	}
	private static void EX2() throws Exception {
		InputStream is = System.in;
		byte [] datas= new byte[100];
		
		System.out.println("�̸�:");
		int nameBytes=is.read(datas);
		String name= new String(datas,0,nameBytes-2);
		
		System.out.println("����:");
		int commentBytes=is.read(datas);
		String comment= new String(datas,0,commentBytes-2);
		
		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�Է��� ����: " + comment);
		
	}
	
	private static void EX3() throws Exception {
		OutputStream os = System.out;
		for (byte b=48;b<58;b++) {
			os.write(b);
		}
		os.write(10);
		for (byte b=97;b<123;b++) {
			os.write(b);
		}
		os.write(10);		
		
		String hangul="�����ٶ󸶹ٻ������īŸ����";
		byte [] hangulBytes=hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}

	private static void EX4() throws Exception{
		//BufferedReader Example
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("�Է�: ");
		String lineString = br.readLine();
		
		System.out.println("���: "+ lineString);
		
	}
	private static void EX5() throws Exception{
		//DataInputOutputStream Example
		FileOutputStream fos= new FileOutputStream("C:/work/primitive.dat");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("�̼���");
		dos.writeDouble(97.5);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis =new FileInputStream("C:/work/primitive.dat");
		DataInputStream dis= new DataInputStream(fis);
		
		for (int i=0;i<2;i++) {
			String name= dis.readUTF();
			double score=dis.readDouble();
			int order=dis.readInt();
			System.out.println(name + " : "+ score+ " : " +order);

		}
		dis.close();
		fis.close();
	
		
	}
	private static void EX6() throws Exception {
		//PrintStream Example
		FileOutputStream fos = new FileOutputStream("C:/work/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("������ ���� ��Ʈ��");
		ps.print("��ġ ");
		ps.print("�����Ͱ� ����ϴ� �� ó�� ");
		ps.print("����մϴ�.");
		
		ps.flush();
		ps.close();
		fos.close();
		
	}


}
