package day15;

import java.util.ArrayList;
import java.util.Comparator;

public class Stream03 {

	public static void main(String[] args) {
		// Student class List 생성
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",56));
		list.add(new Student("홍길둥",46));
		list.add(new Student("홍길똥",36));
		list.add(new Student("홍길당",26));
		list.add(new Student("홍길딩",16));
		list.add(new Student("홍길덩",66));
		list.add(new Student("홍길둉",76));
		
		// 스트림을 이용하여 출력 = > 홍길동 : 56
		// toString 사용
		list.stream().forEach(l -> System.out.println());
		
		// toString 미사용
		list.stream()
		    .forEach( l -> {
		    String name = l.getName();
		    int score = l.getScore();
		    System.out.println(name+":"+score);
	});
		//list의 점수 합계
		int totalScore = list.stream()
				        .mapToInt(s->s.getScore())
				        .sum();
		System.out.println("총 점수 : " + totalScore);
		
		
		
		//list의 인원수
		long count = list.stream().count();
				System.out.println("총 인원수 :" + count);
		
		//정렬 : 이름을 가나다라 순으로 정렬(오름차순)
				list.stream()
				.sorted(new Comparator<Student>() {
					
					
					@Override
					 public int compare(Student o1, Student o2) {
						
						return o1.getName().compareTo(o2.getName());
					}
				})
			.forEach(n -> System.out.println(n));
				
				//정렬 : 점수가 높은 순으로 정렬 ( 점수 기준 내림차순)
				list.stream()
				.sorted(new Comparator<Student>() {
					
					
					@Override
					 public int compare(Student o1, Student o2) {
					
						return o2.getScore() - o1.getScore();
					}
				})
			.forEach(n -> System.out.println(n));
				
				System.out.println("---Comparable 구현---");
				//Comparable<Student> 클래스에서 구현한 정렬
				list.stream().sorted().forEach(n ->System.out.println(n));
	}
}











//package day11;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class StudentController implements Program {  // 학교가 학생을 등록 (학교 입장)
//   
//    private List<Student> studentList = new ArrayList<>(); // 학생 정보를 저장하는 리스트
//    private List<Subject> subList = new ArrayList<>(); // 수강신청 가능한 모든 과목의 목록
//    
//    // 학생 추가 메서드
//    public void addStudent() {
//        studentList.add(new Student("111", "김순이", "20", "010-1111-1111", "서울 강남구"));
//        studentList.add(new Student("222", "김순이", "20", "010-1111-1111", "서울 강남구"));
//        studentList.add(new Student("333", "김순이", "20", "010-1111-1111", "서울 강남구"));
//    }
//    
//    // 과목 목록 추가 메서드
//    public void addSubList() {
//        subList.add(new Subject("1111", "java", 3, 2, "홍길동", "화목/2시~4시", "1강의장"));
//        subList.add(new Subject("2222", "java", 3, 2, "홍길동", "화목/2시~4시", "1강의장"));
//        subList.add(new Subject("3333", "java", 3, 2, "홍길동", "화목/2시~4시", "1강의장"));
//        subList.add(new Subject("4444", "java", 3, 2, "홍길동", "화목/2시~4시", "1강의장"));
//        subList.add(new Subject("5555", "java", 3, 2, "홍길동", "화목/2시~4시", "1강의장"));
//    }
//    
//    public void subListPrint() {
//        System.out.println("--수강 과목 목록--");
//        for (Subject s : subList) {
//            System.out.println(s);
//        }
//        System.out.println("-------------------");
//    }
//
//    public int menuPrint(Scanner sc) {
//        System.out.println("--menu--");
//        System.out.println("1.학생등록 | 2.전체 학생 리스트 출력 |3.학생 검색(학생정보,수강정보)");
//        System.out.println("4.수강신청(한 학생에 대한) | 5.수강철회(한 학생에 대한) | 6.종료");
//        System.out.print("메뉴선택>");
//        return sc.nextInt();
//    }
//
//    @Override
//    public void insertStudent(Scanner sc) {
//        System.out.print("학번>");
//        String num = sc.next();
//        System.out.print("이름>");
//        String name = sc.next();
//        System.out.print("나이>");
//        String age = sc.next();
//        System.out.print("전화번호>");
//        String phone = sc.next();
//        sc.nextLine();
//        System.out.print("주소>");
//        String address = sc.nextLine();
//
//        studentList.add(new Student(num, name, age, phone, address));
//    }
//
//    @Override
//    public void searchStudent(Scanner sc) {
//        System.out.println("--학생명단--");
//        for (Student s : studentList) {
//            System.out.println(s);
//        }
//    }
//
//    @Override
//    public void insertSubject(Scanner sc) {
//        System.out.print("검색할 학번>");
//        String searchNum = sc.next();
//
//        for (Student s : studentList) {
//            if (s.getStudentId().equals(searchNum)) {
//                System.out.println(s);
//                return;
//            }
//        }
//        System.out.println("검색한 학생이 없습니다");
//    }
//
//    @Override
//    public void deleateSubject(Scanner sc) {
//        System.out.print("수강신청 학번>");
//        String studentIdString = sc.next();
//        Student foundStudent = null;
//
//        for (Student s : studentList) {
//            if (s.getStudentId().equals(studentIdString)) {
//                foundStudent = s;
//                break;
//            }
//        }
//        
//        if (foundStudent == null) {
//            System.out.println("학생정보가 없습니다");
//            return;
//        }
//        
//        subListPrint();
//        System.out.print("선택과목 번호>");
//        String subNum = sc.next();
//        Subject foundSubject = null;
//
//        for (Subject s : subList) {
//            if (s.getSubNum().equals(subNum)) {
//                foundSubject = s;
//                break;
//            }
//        }
//        
//        if (foundSubject != null) {
//            foundStudent.insertSubject(foundSubject);
//            System.out.println("수강 신청 완료!");
//        } else {
//            System.out.println("해당 과목을 찾을 수 없습니다.");
//        }
//    }
//
//    @Override
//    public void printStudent() {
//        for (Student s : studentList) {
//            System.out.println(s);
//        }
//    }
//}
