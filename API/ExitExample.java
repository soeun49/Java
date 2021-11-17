package com.java.november.API;

public class ExitExample {

	public static void main(String[] args) {
		
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException ();
				}
			}			
		});
		
		for (int i=0; i<10;i++) {
			System.out.println(i);
			try {
				//JVM 종료요청
				System.exit(i);
			}catch (SecurityException e){
				
			}
		}

	}

}

// if i==5, JVM 종료
// 종료 상태값이 5가 아니면 보안관리자에서 SecurityException을 발생시키고 예외처리를 함  
