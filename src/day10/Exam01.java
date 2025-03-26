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









//    List<Subject> subjects = student.getSubjects();
//    if (subjects.isEmpty()) {
//        System.out.println("이 학생은 현재 수강 중인 과목이 없습니다.");
//        return;
//    }
//
//    for (Subject subject : subjects) {
//        System.out.println(subject);
//    }
//
//    System.out.print("성적을 등록할 과목 코드: ");
//    String subjectCode = sc.next();
//    Subject subjectToGrade = null;
//
//    for (Subject subject : subjects) {
//        if (subject.getSubjectCode().equals(subjectCode)) {
//            subjectToGrade = subject;
//            break;
//        }
//    }
//
//    if (subjectToGrade == null) {
//        System.out.println("해당 과목을 찾을 수 없습니다.");
//        return;
//    }
//
//    System.out.print("등록할 성적 (0~100): ");
//    double score = sc.nextDouble();
//    if (score < 0 || score > 100) {
//        System.out.println("유효한 점수를 입력해주세요 (0~100). 성적 등록이 취소됩니다.");
//        return;
//    }
//    
//    subjectToGrade.setScore(score);
//    System.out.println(subjectToGrade.getSubjectName() + " 과목의 성적이 " + score + "점으로 등록되었습니다.");
//}