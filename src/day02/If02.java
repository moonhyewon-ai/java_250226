package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아
		 * 합계, 평균,pass여부를 출력
		 * pass여부는 평균이 80이상이면 합격
		 * 각각의 점수가 100점보다 크거나 0점보다 작으면 에러처리
		 * 
		 * break; : 구문종류
		 * return : 메서드 종료
		 */
 Scanner sc = new Scanner(System.in);
 
  System.out.println("국어 점수>");
  int kor = sc.nextInt();
  System.out.println("영어 점수>");
  int eng = sc.nextInt();
  System.out.println("수학 점수>");
  int math = sc.nextInt();
  
  sc.nextLine();
  
  
  
  if ( kor > 100 || kor < 0 || eng > 100 || eng <0 || math > 100  || math < 0 ) {
	  System.out.println("에러");
  }else {
	  int sum = kor+eng+math;
	  double avg =sum/3;
	  System.out.println("합계:" + sum);
	  System.out.println("평균:" + avg);
	  
   if ( avg >= 80) {
	   System.out.println("합격");
   } else {
		      System.out.println("불합격");
	   }
	   
   }
  }
	}


