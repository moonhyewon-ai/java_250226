package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고,
		 * num1 =2, num2=3
		 * menu
		 * 1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료
		 * menu에 따라서 두 수의 연산 결과를 출력
		 * 1=> 2+3 =5
		 * 2=> 2-3=-1
		 * ...
		 * 4=> 2/0 = num2를 다시 입력해주세요.
		 * 5=> 2%0 = num2를 다시 입력해주세요.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("num1,num2 =");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
		int menu=0;
		do {
			System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료");
			System.out.println(">");
			menu = sc.nextInt();
			
			//실제 처리기능을 구현하는 문
			switch (menu) {
			case 1:
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
				break;
			case 2:
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
				break;
			case 3:
				System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
				break;
			case 4:
				if (num2==0) {
					System.out.println("num2를 다시 입력해주세요.");
				}else {
				System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
				}
				break;
			case 5:
				if (num2==0) {
					System.out.println("num2를 다시 입력해주세요.");
				}else {
				System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
				}
				break;
			default:
				System.out.println("종료");
				break;
			}
		}while(menu!=6);
	}

}
