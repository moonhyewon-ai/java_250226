package day07;

import java.util.Scanner;

public class Method04 {
	/* 정수(2~9까지 중 하나)를 입력받아
	 * 리턴타입 : 출력 => 없음 void
	 * 메서드명 : multi
	 * 매개변수 : 정수하나 => int num1
	 * 
	 */
	public static void  multi(int num) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				
				System.out.print(i +"*"+ j + "=" + (i*j)+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		int num=5;
		multi(5);
//다른 클래스에 있는 메서드를 호출할 경우
// 클래스명.메서드명(); => static일 경우
// method04.multi();
	}
}