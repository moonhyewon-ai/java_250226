package day16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentController controller = new StudentController();

        boolean exit = false;

        controller.addStudent();
        controller.addSubList();

        while (!exit) {
            int choice = controller.menuPrint(sc);

            switch (choice) {
                case 1:
                    controller.insertStudent(sc);
                    break;
                case 2:
                    controller.printStudent();
                    break;
                case 3:
                    controller.searchStudent(sc);  // 학생 검색에서 과목별 학생 조회 포함됨
                    break;
                case 4:
                    controller.insertSubject(sc);
                    break;
                case 5:
                    controller.deleteSubject(sc);
                    break;
                case 6:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
        sc.close();
    }
}
