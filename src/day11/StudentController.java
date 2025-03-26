package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private List<Student> studentList = new ArrayList<>();
    private List<Subject> subList = new ArrayList<>();

    public void addStudent() {
        studentList.add(new Student("202400408", "홍길동", 20, "010-1111-1111", "서울 강남구"));
        studentList.add(new Student("202405768", "일이삼", 21, "010-2222-1111", "서울 광진구"));
        studentList.add(new Student("202434523", "사오육", 22, "010-3333-1111", "서울 강남구"));
    }

    public void addSubList() {
        subList.add(new Subject("1111", "Java", 3, 2, "이선희", "화목/2시~4시", "1강의장"));
        subList.add(new Subject("2222", "C++", 3, 3, "이삼호", "화수/2시~4시", "2강의장"));
    }

    public int menuPrint(Scanner sc) {
        System.out.println("--menu--");
        System.out.println("1. 학생 등록 | 2. 전체 학생 리스트 출력 | 3. 학생 검색(학생정보, 수강정보)");
        System.out.println("4. 수강신청(한 학생에 대한) | 5. 수강철회(한 학생에 대한) | 6. 종료");
        System.out.print("메뉴선택> ");
        return sc.nextInt();
    }

    public void insertSubject(Scanner sc) {
        System.out.print("수강신청 학번> ");
        String studentId = sc.next();
        Student foundStudent = findStudentById(studentId);
        
        if (foundStudent == null) {
            System.out.println("해당 학번의 학생이 없습니다.");
            return;
        }

        System.out.print("수강신청 과목 코드> ");
        String subjectCode = sc.next();
        Subject foundSubject = findSubjectByCode(subjectCode);
        
        if (foundSubject == null) {
            System.out.println("해당 과목이 없습니다.");
            return;
        }

        //  학생이 과목을 듣게 추가
        foundStudent.addSubject(foundSubject);
        foundSubject.enrollStudent(foundStudent);

        //  입력한 학생 정보 그대로 출력!
        System.out.println("학번: " + foundStudent.getStudentId() + ", 이름: " + foundStudent.getName() +
                           ", 나이: " + foundStudent.getAge() + ", 전화번호: " + foundStudent.getPhone() +
                           ", 주소: " + foundStudent.getAddress());
    }


    public void deleteSubject(Scanner sc) {
        System.out.print("수강 철회할 학번> ");
        String studentId = sc.next();
        Student foundStudent = findStudentById(studentId);

        if (foundStudent == null) {
            System.out.println("해당 학번의 학생이 없습니다.");
            return;
        }

        System.out.print("철회할 과목 코드> ");
        String subjectCode = sc.next();
        Subject foundSubject = findSubjectByCode(subjectCode);

        if (foundSubject == null) {
            System.out.println("해당 과목이 없습니다.");
            return;
        }

//        if (!foundStudent.getSubjects().contains(foundSubject)) {
//            System.out.println("해당 학생은 이 과목을 수강하지 않습니다.");
//            return;
//        }

        foundStudent.removeSubject(foundSubject);
        foundSubject.removeStudent(foundStudent);

        System.out.println("수강 철회 완료!");
        System.out.println("학번: " + foundStudent.getStudentId() + ", 이름: " + foundStudent.getName() +
                           ", 나이: " + foundStudent.getAge() + ", 전화번호: " + foundStudent.getPhone() +
                           ", 주소: " + foundStudent.getAddress());
    
    }
    public void searchStudent(Scanner sc) {
        System.out.print("검색할 학번> ");
        String studentId = sc.next();
        Student foundStudent = findStudentById(studentId);

        if (foundStudent == null) {
            System.out.println("해당 학번의 학생이 없습니다.");
            return;
        }

        System.out.print("검색할 과목 코드> ");
        String subjectCode = sc.next();
        
        boolean found = false;
        for (Subject subject : foundStudent.getSubjects()) {
            if (subject.getSubjectCode().equals(subjectCode)) {
                System.out.println("학생 정보: " + foundStudent);
                System.out.println("수강 중인 과목 정보: " + subject);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학생은 이 과목을 수강하지 않습니다.");
        }
    }


    public void searchSubjectStudents(Scanner sc) {
        System.out.print("조회할 과목 코드> ");
        String subjectCode = sc.next();
        Subject foundSubject = findSubjectByCode(subjectCode);
        if (foundSubject == null) {
            System.out.println("해당 과목이 없습니다.");
            return;
        }

        List<Student> students = foundSubject.getEnrolledStudents();
        if (students.isEmpty()) {
            System.out.println("해당 과목을 수강하는 학생이 없습니다.");
        } else {
            System.out.println("수강 학생 명단:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private Student findStudentById(String studentId) {
        for (Student s : studentList) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    private Subject findSubjectByCode(String subjectCode) {
        for (Subject s : subList) {
            if (s.getSubjectCode().equals(subjectCode)) {
                return s;
            }
        }
        return null;
    }

    public void printStudent() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

   public void insertStudent(Scanner sc) {
      // TODO Auto-generated method stub
      
   }
}

