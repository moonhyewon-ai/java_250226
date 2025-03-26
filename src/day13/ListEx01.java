package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListEx01 {

	public static void main(String[] args) {
		// 두 배열을 합쳐 하나의 list로 작성
		// 정렬해서 출력
     String[] arr1 = new String[] {"c", "f", "a" , "b"};
     String[] arr2 = new String[] {"e", "b", "g" , "f"};
     
     ArrayList<String> list = new ArrayList<>();

     for (String s : arr1) {
         list.add(s);
     }
     for (String s : arr2) {
         list.add(s);
     }

     // 정렬
     list.sort(new Comparator<String>() {
 		
 		@Override
 		 public int compare(String o1,String  o2) {
 			//compareTo
 			//o1.compareTo(o2) : 오름차순
 			//o1.compareTo(o1) : 내림차순
 			return o1.compareTo(o2);
 		}
 	});
     System.out.println("정렬된 리스트: " + list);
	}
	}





//
//// Kiosk 실행 클래스
//public class Kiosk {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        MenuController menuController = new MenuController();
//        OrderController orderController = new OrderController();
//
//        while (true) {
//            System.out.println("\n1. 메뉴 추가 | 2. 메뉴 삭제 | 3. 메뉴 수정 | 4. 메뉴 보기 | 5. 주문 | 6. 주문 내역 출력 | 7. 종료");
//            System.out.print("선택: ");
//            int choice = sc.nextInt();
//            sc.nextLine(); // 버퍼 비우기
//
//            switch (choice) {
//                case 1:
//                    System.out.print("추가할 메뉴 이름: ");
//                    String addName = sc.nextLine();
//                    System.out.print("가격: ");
//                    int addPrice = sc.nextInt();
//                    menuController.addMenu(addName, addPrice);
//                    break;
//                case 2:
//                    System.out.print("삭제할 메뉴 이름: ");
//                    String removeName = sc.nextLine();
//                    menuController.removeMenu(removeName);
//                    break;
//                case 3:
//                    System.out.print("수정할 메뉴 이름: ");
//                    String updateName = sc.nextLine();
//                    System.out.print("새 가격: ");
//                    int newPrice = sc.nextInt();
//                    menuController.updateMenuPrice(updateName, newPrice);
//                    break;
//                case 4:
//                    menuController.showMenu();
//                    break;
//                case 5:
//                    System.out.print("주문할 메뉴 이름: ");
//                    String orderName = sc.nextLine();
//                    System.out.print("수량: ");
//                    int quantity = sc.nextInt();
//                    orderController.placeOrder(menuController, orderName, quantity);
//                    break;
//                case 6:
//                    orderController.showOrders();
//                    break;
//                case 7:
//                    System.out.println("키오스크를 종료합니다.");
//                    sc.close();
//                    return;
//                default:
//                    System.out.println("올바른 선택이 아닙니다.");
//            }
//        }
//    }
//}