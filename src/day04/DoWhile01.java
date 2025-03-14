package day04;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/* 반복문 : for,while,do~while
		 * for,while : 실행문을 먼저 실행하고, 조건식을 나중에 비교
		 * do~while : 실행문을 먼저 실행하고, 조건식을 나중에 비교
		 * 무조건 1번은 실행 후 비교하는 구조
		 * 
		 * do{
		 *   실행문;
		 *  } while(조건식);  //조건식이 참이어야 반복
		 */
		Scanner sc = new Scanner(System.in);
		/* 한 글자를 입력 받아서 출력
		 * y=> 출력
		 */
		char ch = 'y';
		
		do {
			System.out.println("한글자입력>");
			ch = sc.next().charAt(0);
			System.out.println(ch);
			
		}while(ch != 'y');

		System.out.println("종료");
	}

}
