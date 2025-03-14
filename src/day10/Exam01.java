package day10;

import java.util.ArrayList;
import java.util.Scanner;

import day11.Subject;

public class Exam01 {

	public static void main(String[] args) {
		/* 성적표
		 * 몇 명의 성적을 출력할지 결정 > 3
		 * 이름 국어 영어 수학 총점 평균 석차     >>syso로 모양만 출력
		 * hong 89 90  85  00  00  0      >>실제값은 이거  (n행7열)
		 * choi 89 90  85  00  00  0
		 * park 89 90  85  00  00  0
		 * "\t" : 탭(띄어쓰기)
		 */
		
		/* Report 클래스 생성
		 * 이름 국어 영어 수학 총점 평균 석차 => 멤버변수
		 * 메서드 체크
		 */
		
		/* main Report 객체의 배열 생성
		 * 석차 구하기
		 */
	}
}

class Report {
	String name;
	int kor,eng,math,total,rank;
	double avg;
	
	//생성자
	public Report(String name, int kor, int eng, int math) {
      this.name=name;
      this.kor=kor;
      this.eng=eng;
      this.math=math;
      this.total=kor+eng+math;
      this.rank=1;
      this.avg=total/3;
    }
	
	//성적 출력 메서드
	public void printReport() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + rank);
	}
}
