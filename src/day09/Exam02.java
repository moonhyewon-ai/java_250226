package day09;

public class Exam02 {
	public static void main(String[] args) {
        // 학생 객체 생성
        Student st1 = new Student("홍길동", "010-1234-4567", "강남");
        st1.setAge(23);
        st1.insertCourse("Java", "25-01-05 ~ 25-01-30");
        st1.insertCourse("공공데이터 국비", "25-02-26 ~ 25-08-01");

        Student st2 = new Student("김철수", "990101", "010-2222-3333", 21, "강남");
        st2.insertCourse("Java", "25-01-05 ~ 25-01-30");
        st2.insertCourse("공공데이터 국비", "25-02-26 ~ 25-08-01");

        // 학생 배열 생성
        Student[] students = new Student[8];
        students[0] = st1;
        students[1] = st2;
        students[2] = new Student("이영희", "970101", "010-4444-8888", 31, "수원");
        students[2].insertCourse("Java", "25-01-05 ~ 25-01-30");
        students[2].insertCourse("공공데이터 국비", "25-02-26 ~ 25-08-01");
        students[2].insertCourse("DB", "25-02-01 ~ 25-02-28");

        students[3] = new Student("박민수", "070101", "010-5555-8888", 19, "수원");
        students[3].insertCourse("공공데이터 국비", "25-02-26 ~ 25-08-01");
        students[3].insertCourse("DB", "25-02-01 ~ 25-02-28");

        students[4] = new Student("최지우", "990101", "010-1111-8888", 29, "강남");
        students[4].insertCourse("Java", "25-01-05 ~ 25-01-30");
        students[4].insertCourse("공공데이터 국비", "25-02-26 ~ 25-08-01");

        students[5] = new Student("강호준", "980101", "010-9999-8888", 30, "수원");
        students[5].insertCourse("Java", "25-01-05 ~ 25-01-30");
        students[5].insertCourse("공공데이터 국비", "25-02-26 ~ 25-08-01");
        students[5].insertCourse("DB", "25-02-01 ~ 25-02-28");

        students[6] = new Student();
        students[6] = new Student("hong2", "070101", "010-6666-8888", 19, "강남");

        students[7] = new Student("이철수", "970101", "010-3333-8888", 31, "수원");

        // 학생 정보 출력
        for (Student student : students) {
            if (student != null) {
                student.printInfo();
                student.printCompany();
                student.printCourse();
                System.out.println("-------------------------");
                String searchName="kang";
                for(int i=0; i<students.length; i++) {
                	if(students[i].getName().equals(searchName)) {
                		students[i].printInfo();
                		students[i].printCompany();
                		students[i].printCourse();
                	}
                }
                System.out.println("---------------------------");
                String searchCourse = "java";   //=>학생정보/ 회사정보만 확인
                System.out.println("--" + searchCourse + "의 수강학생 목록--");
                int cnt=0;
                while(cnt<students.length) {
                	for(int i=0; i<students[cnt].getCnt(); i++) {
                		if(students[cnt].getCourse()[i].equals(searchCourse)){
                			students[cnt].printInfo();
                			students[cnt].printCompany();
                		}
                	}
                		cnt++;			
                	}
                System.out.println("--------------------------------");
                String searchBranch = "강남";
                System.out.println("--" + searchBranch+"의 수강학생 목록--");
               
              
                for (int i=0; i<students.length; i++) {
                	if(students[i].getBranch() != null) {
                		if(students[i].getBranch().equals(searchBranch)) {
                			students[i].printInfo();
                		}
                    }
                }
                
                
                
                
                
                
                
                
                
                
            }
        }
       
}
}
