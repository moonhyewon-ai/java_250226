package day11;

import java.util.Scanner;

public interface Program {
     /* 1.학생등록 | => void insertStudent(Scanner sc);
      * 2.전체 학생 리스트 출력 | => void printStudent();
      * 3.학생 검색(학생정보,수강정보)| => void searchStudent(Scanner sc);
      * 4.수강신청(한 학생에 대한) | => void insertSubject(Scanner sc);
      * 5.수강철회(한 학생에 대한) | =>void deleateSubject(Scanner sc);
      * 6.종료 
      */
	
	void insertStudent(Scanner sc);
	void printStudent();
	void searchStudent(Scanner sc);
	void insertSubject(Scanner sc);
	void deleateSubject(Scanner sc);
	void deleteSubject(Scanner sc);
}
