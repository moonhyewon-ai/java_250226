package day11;

import java.util.Scanner;

public class StudentController implements Program{  //학교가 학생을 등록 (학교 입장)
	
	    private Student[] student= new Student[10]; // 학생 정보를 저장하는 배열(학생은 한 둘이 아니니)
	    private int cnt; //student index 처리하기 위한 변수
	    
	    private Subject[] subList = new Subject[5]; // 과목 목록 배열 : 수강신청 가능한 모든 과목의 목록
	    
	  // ---------멤버변수 설정------------
	    
	    public void addStudent() {
	    	Student s = new Student("111", "김순이", "20", "010-1111-1111", "서울 강남구");
	    	student[cnt] = s;
	    	cnt++;
	    	Student s1 = new Student("222", "김순이", "20", "010-1111-1111", "서울 강남구");
	    	student[cnt] = s1;
	    	cnt++;
	    	Student s2 = new Student("333", "김순이", "20", "010-1111-1111", "서울 강남구");
	    	student[cnt] = s2;
	    	cnt++;
	    }
	    
	    
	    
	    public void addSubList() {
	    	subList [0] = new Subject("1111", "java",3,2,"홍길동","화목/2시~4시","1강의장");
	    	subList [1] = new Subject("2222", "java",3,2,"홍길동","화목/2시~4시","1강의장");
	    	subList [2]= new Subject("3333", "java",3,2,"홍길동","화목/2시~4시","1강의장");
	    	subList [3]= new Subject("4444", "java",3,2,"홍길동","화목/2시~4시","1강의장");
	    	subList [4]= new Subject("5555", "java",3,2,"홍길동","화목/2시~4시","1강의장");
	    }
	    
	    public void subListPrint() {
	    	System.out.println("--수강 과목 목록--");
	    	for(Subject s : subList) {
	    		System.out.println(s);
	    	}
	    	System.out.println("-------------------");
	    }
	    
	   //메뉴를 출력하는 메서드
	    //리턴타입 : 내가 고른 메뉴 리턴 / 매개변수 : 없음.
	    public int menuPrint(Scanner sc) {
	    	System.out.println("--menu--");
	    	System.out.println("1.학생등록 | 2.전체 학생 리스트 출력 |3.학생 검색(학생정보,수강정보)");
	    	System.out.println("4.수강신청(한 학생에 대한) | 5.수강철회(한 학생에 대한) | 6.종료");
	    	System.out.println("메뉴선택>");
	    	return sc.nextInt();
	    }

		@Override
		public void insertStudent(Scanner sc) {
			// 학생을 등록하는 메서드 ( 수강 정보는 별개)
			//학번,이름,나이,전화번호,주소
			 System.out.println("학번>");
			 String num = sc.next();
			 System.out.println("이름>");
			 String name = sc.next();
			 System.out.println("나이>");
			 String age= sc.next();
			 System.out.println("전화번호>");
			 String phone = sc.next();
			 sc.nextLine();  //공백 처리용
			 System.out.println("주소>");
			 String address = sc.nextLine();
			
			 //학생 객체 생성
			 Student s= new Student(num,name,age,phone,address);   //전체적인 큰 틀 먼저 잡고 그 담에 세부내용 파악하기
			 student[cnt] = s;
			 cnt++;
		}

		

		@Override
		public void searchStudent(Scanner sc) {
			// 학생배열 출력.
			System.out.println("--학생명단--");
			for(int i=0; i<cnt; i++) {
				System.out.println(student[i]);
			}
			
		}

		@Override
		public void insertSubject(Scanner sc) {
			// 학생 검색
			// 검색할 학생의 학번을 받아 출력
			System.out.println("검색할 학번>");
			String searchNum = sc.next();
			
			// 학생 배열에서 학번이 있는지 검색
			for(int i=0; i<cnt; i++) {
				if(student[i].getStudentId().equals(searchNum)) {
					System.out.println(student[i]);
					return;
				}
			}
			System.out.println("검색한 학생이 없습니다");
		}

		@Override
		public void deleateSubject(Scanner sc) {
			// 수강신청
			// 누가? (학생) 무슨 과목을 추가할지 설정
			System.out.println("수강신청 학번>");
			String studentIdString = sc.next();
			int index = -1;  //학생의 번지를 저장하기 위한 변수
			
			//학생 위치 탐색
			for(int i=0; i<cnt; i++) {
				if(student[i].getStudentId().equals(studentIdString)) {
					index=i;
					break;
				}
			}
			//학생을 못 찾았다면..
			if(index== -1) {
				System.out.println("학생정보가 없습니다");
				return;
			}
			
			//학생을 찾았다면...수강신청 목록 보여주기
			//과목목록 보여주기
			subListPrint();
			int subIndex= -1;
			System.out.println("선택과목 번호>");
			String subNum =sc.next();
			for(int i=0; i<subList.length; i++) {
				if(subList[i].getSubNum().equals(subNum)) {
					subIndex = i;
					break;
				}
			}
		}



		@Override
		public void printStudent() {
			// TODO Auto-generated method stub
			
		}
}
	
//			   
			
			//// 메인 실행 클래스
			//public class Main {
//			    public static void main(String[] args) {
//			        Customer c1 = new Customer(1001, "홍길동");
//			        GoldCustomer c2 = new GoldCustomer(1002, "이순신");
//			        VIPCustomer c3 = new VIPCustomer(1003, "김유신", "박상담", "010-1111-2222");
			//
//			        System.out.println("상품 가격: 10000원");
//			        System.out.println(c1.customerName + " 최종 가격: " + c1.calcPrice(10000));
//			        System.out.println(c2.customerName + " 최종 가격: " + c2.calcPrice(10000));
//			        System.out.println(c3.customerName + " 최종 가격: " + c3.calcPrice(10000));
			//
//			        System.out.println("\n[고객 정보]");
//			        c1.customerInfo();
//			        c2.customerInfo();
//			        c3.customerInfo();
//			    }
			//}
			