package day09;

public class Exam01 {

	public static void main(String[] args) {
		/* 메서드로 작업  (static 붙이지 말고 객체 만들어서 실행)
		 * 두 정수의 값이 주어졌을 때
		 * 두 정수 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex) a=3, b=5 => 3+4+5
		 * ex)a=10, b=5 => 5+6+7+8+9+10
		 * ex)a=10, b=10 => 10
		 */
		Exam01 e1 = new Exam01();
		System.out.println(e1.sum(3, 5));
		System.out.println(e1.sum(10, 5));
		System.out.println(e1.sum(3, 3));

	}

	// 매개변수 : 두 정수 => int num1, int num2
		// 리턴타입 : 합 => int
		public int sum(int num1, int num2) {
			int a=0, b=0, sum=0;
//			if(num1 > num2) {
//				a = num2;
//				b = num1;
//			}else if(num1 < num2) {
//				a = num2;
//				b = num1;
//			}else {
//				return num1;
//			}
//			
//			if(num1 > num2) {
//				int tmp = num1;
//				num1 = num2;
//				num2 = tmp;
//			}
			
			a = Math.min(num1, num2);
			b = Math.max(num1, num2);
			num1 = a; num2 = b;
			for(int i=num1; i<=num2; i++) {
				sum+= i;
			}
			return sum;
		}
		

	}


































//student.printStudentInfo(); // 학생 기본 정보 출력
//
//// 수강 과목 추가
//student.addCourse("공공데이터 국비", "25-02-26 ~ 25-08-01");
//student.addCourse("java", "25-01-05 ~ 25-01-30");
//
//student.printCourses(); // 수강 정보 출력
//}
//}
//
//class Student {
//// 학생 기본 정보
//private String name;
//private String birthDate;
//private String phone;
//private int age;
//
//// 학원 정보 (학원명은 변경 불가)
//private static final String ACADEMY_NAME = "KOREAIT";
//private String branch;
//
//// 수강 정보 (최대 5과목)
//private String[] courses = new String[5];
//private String[] periods = new String[5];
//private int courseCount = 0;
//
//// 생성자
//public Student(String name, String birthDate, String phone, int age, String branch) {
//this.name = name;
//this.birthDate = birthDate;
//this.phone = phone;
//this.age = age;
//this.branch = branch;
//}
//
//// 학생 기본 정보 출력
//public void printStudentInfo() {
//System.out.println(name + " " + birthDate + " " + phone + " (" + age + ")");
//System.out.println(ACADEMY_NAME + "(" + branch + ")");
//}
//
//// 수강 정보 출력
//public void printCourses() {
//if (courseCount == 0) {
//    System.out.println("수강 중인 과목이 없습니다.");
//    return;
//}
//for (int i = 0; i < courseCount; i++) {
//    System.out.println(courses[i] + " (" + periods[i] + ")");
//}
//}
//
//// 수강 과목 추가
//public void addCourse(String course, String period) {
//if (courseCount >= 5) {
//    System.out.println("더 이상 수강 과목을 추가할 수 없습니다.");
//    return;
//}
//courses[courseCount] = course;
//periods[courseCount] = period;
//courseCount++;
//}
//}