package sale;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class ListEx01 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 입력받은 숫자로 list를 구성
		 * 전체 출력 => 전체 합계 출력
		 * 
		 * ex) 입력 > 45,89,78,58,96,85,74,52,36 enter
		 * 각각의 값을 숫자로 변환 후 list에 추가
		 * 그리고 합계를 출력
		 * - 점수가 70점 이상인 인원 수 : 5명
		 */
     Scanner sc = new Scanner(System.in);
     
     System.out.println("숫자를 입력하세요 >");
     int num = sc.nextInt();
     
     List<Integer> score = new ArrayList<>();
     
     int sum = 0, count = 0;

     for (String s : ) {
         int score = Integer.
         score.add(score);
         sum += score;
         if (score >= 70) count++;
     }

     System.out.println("입력된 점수: " + score);
     System.out.println("전체 합계: " + sum);
     System.out.println("70점 이상 인원 수: " + count);

     
 }

   
     
	}

//parseInt(s.trim());




