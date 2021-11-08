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
		System.out.println("==메뉴==");
		System.out.println("1.예금 조회");
		System.out.println("2.예금 출금");
		System.out.println("3.예금 입금");
		System.out.println("4.종료하기");
		System.out.println("메뉴를 선택하세요");
		
		InputStream is = System.in;
		char inputChar= (char)is.read();
		switch(inputChar) {
		case '1':
			System.out.println("예금 조회를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("예금 출금을 선택하셨습니다.");
			break;
		case '3':
			System.out.println("예금 입금을 선택하셨습니다.");
			break;
		case '4':
			System.out.println("종료하기를 선택하셨습니다.");
			break;
		}
		
	}
	private static void EX2() throws Exception {
		InputStream is = System.in;
		byte [] datas= new byte[100];
		
		System.out.println("이름:");
		int nameBytes=is.read(datas);
		String name= new String(datas,0,nameBytes-2);
		
		System.out.println("내용:");
		int commentBytes=is.read(datas);
		String comment= new String(datas,0,commentBytes-2);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 내용: " + comment);
		
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
		
		String hangul="가나다라마바사아자차카타파하";
		byte [] hangulBytes=hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}

	private static void EX4() throws Exception{
		//BufferedReader Example
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("입력: ");
		String lineString = br.readLine();
		
		System.out.println("출력: "+ lineString);
		
	}
	private static void EX5() throws Exception{
		//DataInputOutputStream Example
		FileOutputStream fos= new FileOutputStream("C:/work/primitive.dat");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("이순신");
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
		
		ps.println("프린터 보조 스트림");
		ps.print("마치 ");
		ps.print("프린터가 출력하는 것 처럼 ");
		ps.print("출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
		
	}


}
