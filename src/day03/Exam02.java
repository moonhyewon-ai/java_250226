package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 주사위 게임 주사위를 던져서 총 30칸을 이동하는 게임 주사위는 랜덤으로 생성 (1~6까지 증 생성) ex) 주사위를 입력하세요 :3
		 * 3칸전진 => 27칸 남았습니다. 주사위를 입력하세요 :1 1칸 전진 => 26칸 남았습니다. 주사위 :6 6칸 전진 => 20칸
		 * 남았습니다. ... 도착~!! 총 이동횟수 : 10번 => 주사위를 던진 횟수
		 */
		Scanner sc = new Scanner(System.in);

		int total = 30;
		int current = 0;
		int count = 0;

		while (current < total) { // true자리에 current < total이 들어가야 함
									// 한 번 돌았을 때 초기화 되는 값일 때 while사용 적절
			int random = (int) (Math.random() * 6 + 1);
			System.out.println("주사위 :" + random);

			System.out.println("주사위를 입력하세요 : ");
			sc.nextInt(); // 입력받은 주사위 수로 뭘 하는 게 없고 그냥 주사위를 굴리는 용도이기 때문에
							// 변수 선언 없이 sc.nextInt(); 로 사용자의 입력만 받아주기

			current += random; // 현재 위치 업데이트
//                                        current에 random(주사위 값)을 계속 갱신해나가면서 더하므로 이런 코드가 나옴
//                                        후에 (total - current)이 코드로 남은 칸 수가 점점 줄어들 수 있는 이유는
//                                         이 코드에서 현재 위치를 계속 누적해서 증가시키기 때문임

			count++;

			if (current >= total) { // 도착을 하면
				System.out.println(" 도착~!! 총 이동횟수: " + count + "번 => 주사위를 던진 횟수");
				break; // 끝내고
			} else { // 도착한 게 아니면
				System.out.println(random + "칸 전진 => " + (total - current) + "칸 남았습니다."); // 남은 수 얼만지 체크
			}
		}
	}
}