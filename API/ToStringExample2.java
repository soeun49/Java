package com.java.november.API;

import java.util.Objects;

public class ToStringExample2 {

	public static void main(String[] args) {
		
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));

	}

}
