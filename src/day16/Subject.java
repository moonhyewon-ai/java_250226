package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Subject {
    private String subjectCode;  
    private String subjectName;  
    private int credit;          
    private int hours;           
    private String professor;    
    private String schedule;     
    private String classroom;    
    private List<Student> enrolledStudents = new ArrayList<>();

    public void enrollStudent11(Student student) {
        if (!enrolledStudents.contains(student)) { // 중복 방지
            enrolledStudents.add(student);
        }
    }

    public List<Student> getEnrolledStudents1() {
        return enrolledStudents;
    }


    public Subject(String subjectCode, String subjectName, int credit, int hours,
                   String professor, String schedule, String classroom) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.credit = credit;
        this.hours = hours;
        this.professor = professor;
        this.schedule = schedule;
        this.classroom = classroom;
    }


    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    @Override
    public String toString() {
        return "과목코드: " + subjectCode + ", 과목명: " + subjectName;
    }

   public void removeStudent(String studentId) {
      // TODO Auto-generated method stub
      
   }

   public Object getStudentId() {
      // TODO Auto-generated method stub
      return null;
   }

   public void removeStudent1(String studentId) {
       Collection<Subject> enrolledStudents = null;
       enrolledStudents.removeIf(student -> student.getStudentId().equals(studentId));
   }

   public void removeStudent(Student student) {
       enrolledStudents.remove(student);
   }

public Object getSubNum() {
	// TODO Auto-generated method stub
	return null;
}


public void enrollStudent(Student student) {
	// TODO Auto-generated method stub
	
}

   
   }