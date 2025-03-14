package day02;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 구칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, d0~while
		 * -for, while 문은 동작방식이 같음.
		 * => 조건에 따라 조건이 맞지 않으면 한 번도 실행되지 않을 수 있음.
		 * 
		 * do~while 문 : 조건에 맞지 않이도 무조건 1번은 실행함.
		 * 
		 * for(초기화; 조건식; 증감식){
		 *  실행문;
		 * }
		 * - 초기화 : 실행문을 반복하기 위한 변수를 초기화 : 생략 가능
		 * - 조건식 : 반복을 결정하는 기능 (true => 반복) : 생략 가능
		 * - 증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복횟수를 조절 : 생략 가능
		 * => 다 생략하면 : for(;;) {
		 *                  }
		 * 기본 구조
		 * for(1초기화; 258조건식; 47증감식) {
		 *   36실행문;
		 * }
		 */

		for(int i=1; i<=10; i++) {
			System.out.println(i);
			System.out.println(": Hello~!!");
		}
		
	System.out.println("--------------");
		//1~10까지 숫자를 출력
		for(int i=1; i<=10; i++) {
			if(i%2==1) {             //홀수만 
			System.out.println(i);
			
		}			
	}
		System.out.println("--------------");
		
		for(int i=10; i>=1; i--) {
			         //10~1까지 출력
			System.out.println(i);
			
		}			
//		for(int i=1; i<=10; i++) {
//	         //10~1까지 출력
//	    System.out.println(11-i);                         >> 이것만 바꿔서도 가능
//	}
		
		System.out.println("--------------");
		
		int even =0;
		a: for(int i=1; ; i++) {
			even = even +2;
			System.out.println(even);
			if(even ==10) {
				break a;
			}	
		}
		System.out.println("--------------");
		//1~10까지의 랜덤 수 5개 출력
		for(int i=1; i<=10; i++) {
	       if (i <= 5) {
			System.out.println((int)(Math.random()*10)+1);
	       }
}			
		System.out.println("--------------");
		//1~10까지의 합계 출력
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;   //sum = sum + i > 0+1,1+2,3+3,6+4,10+5..
			}
		System.out.println(sum);
			
		}
		
	}



       


