package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student {
    private String studentId;  
    private String name;  
    private int age;    
    private String phone;   
    private String address;  
    private List<Subject> subjects = new ArrayList<>(); 

    public Student(String studentId, String name, int age, String phone, String address) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
        subject.enrollStudent(this); 
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "학번: " + studentId + ", 이름: " + name + ", 나이: " + age + 
               ", 전화번호: " + phone + ", 주소: " + address;
    }

   public void removeSubject(Subject foundSubject) {
      // TODO Auto-generated method stub
      
   }

   }