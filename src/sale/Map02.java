package sale;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아(Scanner) map에 저장
		 * 출력 / 합계 / 평균
		 * 종료 키워드가 나올 때까지 반복 (1=> 계속 / 0=종료) >> while문으로
		 * 국어 89
		 * 수학 78
		 * 0 나오면 종료
		 * 합계, 평균 출력
		 * map.size() : 전체 개수
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> score = new HashMap<>();
		
		int exit =1;
		int sum=0;
		
		while(exit!=0) {
			System.out.println("과목과 점수를 입력하세요 : ");
			String num = sc.nextLine();
			
			if (num.equals("0")) break;
			
			int s = sc.nextInt();
			score.put(num, s);
			sum +=s;  //총합 계산
		}
		
		System.out.println("입력된 과목과 점수: " + score);
		int count = score.size(); // 과목 개수
		double avg;
		
		if (count > 0) {
		    avg = (double) sum / count;
		} else {
		    avg = 0;
		}
		
		System.out.println("과목 개수 :" + count);
		System.out.println("총합 :" +sum);
		System.out.println("평균" + avg);
		
		
	}

}

