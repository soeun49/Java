package com.java.november.API;

import java.util.Arrays;
import java.util.Objects;

public class EqualAndDeepEqualsExample {

	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = 1000; 
		
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2) + "\n");
		
		Integer[] array1= {1,2};
		Integer[] array2= {1,2};
		
		System.out.println(Objects.equals(array1, array2));
		System.out.println(Objects.deepEquals(array1, array2));
		System.out.println(Arrays.deepEquals(array1, array2));
		System.out.println(Objects.deepEquals(null, array2));
		System.out.println(Objects.deepEquals(array1, null));
		System.out.println(Objects.deepEquals(null, null));

	}

}

// Equals: �� ��ü�� ���� �� 
// Objects.deepEquals: �� ��ü�� ���� ��, but if �׸��� ��� ���ٸ� return true (== Arrays.deepEquals) 

