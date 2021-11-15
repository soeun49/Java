//사용자 정의 예외 클래스

package com.java.november.Exception;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() {}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
