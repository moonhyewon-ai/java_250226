package day10;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		        System.out.print("몇 명의 성적을 출력할지 결정 > ");
		        int num = sc.nextInt();

		String[] names = {"hong","choi","park"};
		
		Report[] students = new Report[num];
		
		//학생 성적 생성
		for(int i=0; i<num; i++) {
			int kor=(int)(Math.random()*50+50);
			int eng=(int)(Math.random()*50+50);
			int math=(int)(Math.random()*50+50);
			students[i]= new Report(names[i],kor,eng,math);
		}
		
		//석차 계산  >>sum을 비교해서 (배열 비교해서 구하기)
		//객체 봤을 때 가장 작은 단위로 생각해야함. 성적1개 출력같은!(hong학생의 정보 하나 단위)
//		Report.calRank(students);
		
		
//		students[0].printReport();
//		students[1].printReport();
//		students[2].printReport();
		
		// 석차 계산 >>이중 for문
	      for (int i = 0; i < num; i++) {
	         for (int j = 0; j < num; j++) {
	            if (students[i].total < students[j].total) {
	               students[i].rank++;
	            }
	         }
	      }
	      
	      // 성적표 출력
	      System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
	      for (int i = 0; i < num; i++) {
	         students[i].printReport();
	      }
	      

	}

}

//package day11;
//
//import java.util.Scanner;
//
//public class StudentController implements Program { // 학교가 학생을 등록
//    private Student[] students; // 학생 정보를 저장하는 배열
//    private int studentCount;   // 현재 등록된 학생 수
//    private static final int MAX_STUDENTS = 100; // 최대 학생 등록 수
//
//    // 생성자
//    public StudentController() {
//        this.students = new Student[MAX_STUDENTS]; // 배열 초기화
//        this.studentCount = 0; // 처음에는 학생이 없음
//    }
//
//    @Override
//    public void insertStudent(Scanner sc) {
//        if (studentCount >= MAX_STUDENTS) {
//            System.out.println("더 이상 학생을 등록할 수 없습니다. (최대 " + MAX_STUDENTS + "명)");
//            return;
//        }
//
//        System.out.print("학번: ");
//        String studentId = sc.nextLine();
//        System.out.print("이름: ");
//        String name = sc.nextLine();
//        System.out.print("나이: ");
//        int age = Integer.parseInt(sc.nextLine());
//        System.out.print("전화번호: ");
//        String phone = sc.nextLine();
//        System.out.print("주소: ");
//        String address = sc.nextLine();
//
//        students[studentCount] = new Student(studentId, name, age, phone, address);
//        studentCount++; // 학생 수 증가
//        System.out.println(name + " 학생이 등록되었습니다.");
//    }
//
//    @Override
//    public void printStudent() {
//        if (studentCount == 0) {
//            System.out.println("등록된 학생이 없습니다.");
//            return;
//        }
//
//        System.out.println("-- 학생 목록 --");
//        for (int i = 0; i < studentCount; i++) {
//            students[i].printInfo(); // Student 클래스의 printInfo() 호출
//        }
//    }
//
//    @Override
//    public void searchStudent(Scanner sc) {
//        System.out.print("검색할 학생의 학번을 입력하세요: ");
//        String studentId = sc.nextLine();
//
//        for (int i = 0; i < studentCount; i++) {
//            if (students[i].getStudentId().equals(studentId)) {
//                System.out.println("학생을 찾았습니다!");
//                students[i].printInfo();
//                return;
//            }
//        }
//        System.out.println("해당 학번의 학생이 없습니다.");
//    }
//
//    @Override
//    public void insertSubject(Scanner sc) {
//        System.out.print("과목을 추가할 학생의 학번을 입력하세요: ");
//        String studentId = sc.nextLine();
//
//        for (int i = 0; i < studentCount; i++) {
//            if (students[i].getStudentId().equals(studentId)) {
//                System.out.print("추가할 과목명: ");
//                String subjectName = sc.nextLine();
//                System.out.print("학점: ");
//                int credits = Integer.parseInt(sc.nextLine());
//
//                students[i].addSubject(new Subject(subjectName, credits));
//                System.out.println("과목이 추가되었습니다.");
//                return;
//            }
//        }
//        System.out.println("해당 학번의 학생이 없습니다.");
//    }
//
//    @Override
//    public void deleateSubject(Scanner sc) {
//        System.out.print("과목을 삭제할 학생의 학번을 입력하세요: ");
//        String studentId = sc.nextLine();
//
//        for (int i = 0; i < studentCount; i++) {
//            if (students[i].getStudentId().equals(studentId)) {
//                System.out.print("삭제할 과목명: ");
//                String subjectName = sc.nextLine();
//
//                students[i].removeSubject(subjectName);
//                return;
//            }
//        }
//        System.out.println("해당 학번의 학생이 없습니다.");
//    }
//}
//

























//package day11;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//// 학생 관리 컨트롤러 (Program 인터페이스 구현)
//public class StudentController implements Program {
//    private ArrayList<Student> students = new ArrayList<>();
//    
//    // 1. 학생 등록
//    @Override
//    public void insertStudent(Scanner sc) {
//        System.out.print("학번: ");
//        String studentId = sc.nextLine();
//        System.out.print("이름: ");
//        String name = sc.nextLine();
//        System.out.print("나이: ");
//        int age = Integer.parseInt(sc.nextLine());
//        System.out.print("전화번호: ");
//        String phone = sc.nextLine();
//        System.out.print("주소: ");
//        String address = sc.nextLine();
//
//        students.add(new Student(studentId, name, age, phone, address));
//        System.out.println(name + " 학생이 등록되었습니다.");
//    }
//
//    // 2. 전체 학생 리스트 출력
//    @Override
//    public void printStudent() {
//        if (students.isEmpty()) {
//            System.out.println("등록된 학생이 없습니다.");
//        } else {
//            for (Student s : students) {
//                s.printStudentInfo();
//                System.out.println("------------------");
//            }
//        }
//    }
//
//    // 3. 학생 검색
//    @Override
//    public void searchStudent(Scanner sc) {
//        System.out.print("검색할 학번 입력: ");
//        String studentId = sc.nextLine();
//        for (Student s : students) {
//            if (s.getStudentId().equals(studentId)) {
//                s.printStudentInfo();
//                return;
//            }
//        }
//        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
//    }
//
//    // 4. 수강 신청
//    @Override
//    public void insertSubject(Scanner sc) {
//        System.out.print("학번 입력: ");
//        String studentId = sc.nextLine();
//        for (Student s : students) {
//            if (s.getStudentId().equals(studentId)) {
//                System.out.print("수강할 과목 코드 입력: ");
//                String code = sc.nextLine();
//                System.out.print("수강할 과목명 입력: ");
//                String name = sc.nextLine();
//                s.enrollSubject(new Subject(code, name));
//                return;
//            }
//        }
//        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
//    }
//
//    // 5. 수강 철회
//    @Override
//    public void deleateSubject(Scanner sc) {
//        System.out.print("학번 입력: ");
//        String studentId = sc.nextLine();
//        for (Student s : students) {
//            if (s.getStudentId().equals(studentId)) {
//                System.out.print("철회할 과목 코드 입력: ");
//                String code = sc.nextLine();
//                s.withdrawSubject(code);
//                return;
//            }
//        }
//        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
//    }
//}
