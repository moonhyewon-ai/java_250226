package day07;

import java.util.Scanner;

public class MethodEx01 {
	
	public static int sum(int num1,int num2) {
		 
		return num1 + num2;                            //메서드 하나에 리턴값도 하나!!!!!!!!!!!

	}
	
	public static int minus(int num1,int num2) {
		
		return num1-num2;
	}
	public static int gob(int num1,int num2) {
		
		return num1*num2;
	}
public static int division(int num1,int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return num1/num2;
	}
public static int mod(int num1,int num2) {
	if(num2==0) {
		System.out.println("0으로 나눌 수 없습니다.");
		return 0;
	}
	return num1%num2;
}

	public static void main(String[] args) {
		/* 계산기 만들기
		 * 
		 * -- menu --
		 * 1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5.나머지 | 6. 종료
		 * >> 메뉴선택1
		 * >> 숫자 입력 > 1 5
		 * 결과 : 1 + 5 = 6
		 * 
		 * 덧셈,뺄셈,곱셈,나눗셈,나머지는 메서드로 호출하여
		 * 연산결과를 출력
		 */
 Scanner sc = new Scanner(System.in);
 
 System.out.println("--menu--");
 
 System.out.println("숫자 입력>");
 
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	
	int menu=0;
	do {              //메뉴를 무조건 한 번 출력하고 입력받을 수 있음
		System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료");
		System.out.println(">");
		menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("결과 :" +num1 + "+" + num2 + "=" +sum(num1,num2));
			break;
		case 2:
			System.out.println("결과 :" +num1 + "+" + num2 + "="+minus(num1,num2));
			break;
		case 3:
			System.out.println("결과 :" +num1 + "+" + num2 + "="+gob(num1,num2));
			break;
		case 4:
			System.out.println("결과 :" +num1 + "+" + num2 + "="+division(num1,num2));
			break;
		case 5:
			if (num2==0) {
				System.out.println("num2를 다시 입력해주세요.");
			}else {
			System.out.println("결과 :" +num1 + "+" + num2 + "="+mod(num1,num2));
			}
			break;
		default:
			System.out.println("종료");
			break;
		}
	}while(menu!=6);
}


	}


