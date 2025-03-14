package day11;

import java.util.Scanner;

public class Main {  //어디까지 컨트롤러로 하고 어디까지 메인에서 할 건지

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // 컨트롤러 객체 생성
        StudentController controller = new StudentController();  
        int menu =0;
        do {
        	//메뉴넣기
        	menu = controller.menuPrint(sc);
        	
        	switch(menu) {
        	case 1: controller.insertStudent(sc); break;
        	case 2: controller.printStudent(); break;
            case 3: controller.searchStudent(sc); break;
            case 4: controller.insertSubject(sc); break;
            case 5: controller.deleateSubject(sc); break;
            case 6: 
                System.out.println("종료."); 
                break;
            default: 
            	System.out.println("잘못된 메뉴");
        	}
        	
        } while(menu!=6);
        
 
     
}
}