package day10;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		/* Product 클래스 생성 : 상품을 등록하는 클랫
		 * 상품명, 가격
		 * 삼품명과 가격을 출력하는 메서드
		 * 상품을 추가하는 메서드
		 * 
		 */
		
		/* main 클래스에서 처리
		 * 상품 10개를 등록 가능한 배열 생성
		 * 스캐너를 통해서 상품을 등록받기
		 * 등록한 상품을 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Product[] products = new Product[10];  //Product 클래스를 10개 담을 배열 생성
		int count = 0;
		
		while (count < products.length) {
		    System.out.print("상품명을 입력하세요 (종료하려면 'exit' 입력): ");
	    String name = sc.nextLine();
		    if (name.equalsIgnoreCase("exit")) {
		        break;
		    }
		
		    System.out.print("가격을 입력하세요: ");
		    int price = Integer.parseInt(sc.nextLine());
		
		    products[count] = new Product(name, price);
		    count++;
		}
		
		System.out.println("등록된 상품 목록:");
		for (int i = 0; i < count; i++) {
		    products[i].printInfo();
		}
		
	}

}
