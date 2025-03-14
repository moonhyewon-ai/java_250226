package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 컴퓨터와 가위바위보 게임.
		 * 컴퓨터는 랜덤으로 가위/바위/보 중 하나를 선택
		 * (0=가위 /1=바위 / 2=보)       0<1,  0>2 , 1<2, 1>0, 2>1, 2<0
		 * 내가 가위바위보 중 하나를 선택하여 입력   0>2,2<0
		 * ex)
		 * com = 0(가위) me = 보(2)
		 * com 승리~!!
		 * 패배 / 무승부 / 승리 중 하나 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 입력>");
		int num = sc.nextInt();
		int random =((int)(Math.random()*2)+1);
//		System.out.println("컴퓨터 결정 완료" + random);
		
		System.out.println("com =" + random + " " + "me =" + num );
		
		if(random == num) {
			System.out.println("무승부");
		}else if ((random == 0 && num == 2) || (random == 2 && num == 0)) {
				System.out.println("com 승리");
		}else if (random > num) {
		    System.out.println("com 승리");
		} else {
		    System.out.println("com 패배");
		}
}
}
//문자로 출력하려면 삼항연산자 이용