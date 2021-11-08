package com.java.november.book;

import java.util.Calendar;

import com.java.november.book.types.Week;

public class practice05 {
	public static void main(String[] args) {
		
//		Ex1();
//		Ex2();
		

		
	}
	
	private static void Ex2() {
		//name Method
		Week today=Week.SUNDAY;
		String name=today.name();
		System.out.println(name);
		
		//ordinal() method
		int ordinal= today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() method
		Week day1=Week.MONDAY;
		Week day2=Week.TUESDAY;
		int result1=day1.compareTo(day2);
		int result2=day2.compareTo(today);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() method
//		if (args.length ==1) {
//			String strDay=args[0];
//			Week weekDay=Week.valueOf(strDay);
//			if(weekDay==Week.SATURDAY || weekDay==Week.SUNDAY) {
//				System.out.println("�ָ��Դϴ�.");
//			}else {
//				System.out.println("�����Դϴ�.");
//			}
//		}
//		
		//values() method
		Week[] days=Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
			
		
	}
	private static void Ex1() {
		//���� Ÿ�԰� ���� ���
		
		Week today = null;
		
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;		
		case 4:
			today=Week.WEDNESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		
	}
		System.out.println("���� ����: " + today);
		
		if (today==Week.SUNDAY) {
			System.out.println("�Ͽ����Դϴ�.");
		} else {
			System.out.println("���θ� �մϴ�.");
		}
	}
}
