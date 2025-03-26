package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleController {
	
	//멤버변수로 Sale 클래스 리스트를 생성
	//제네릭 클래스 객체 생성
	
	private ArrayList<Sale<String, Integer>> list = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();
	
	public void add(Scanner scan) {
		// 메뉴추가
		System.out.println("메뉴명:");
		String menu = scan.next();
		System.out.println("가격:");
		int price = scan.nextInt();
		
		//객체 생성 후 추가
		Sale<String, Integer> s = new Sale<String, Integer>(menu, price);
		list.add(s);
		System.out.println("메뉴 추가 완료");
	}

	public void print() {
		// 메뉴출력
		for(Sale<String, Integer> s : list) { // list => Sale<String, Integer>
			System.out.println(s);
//			int price = s.getPrice();
		}
		
	}

	public void order(Scanner scan) {
		// 주문
		/* 메뉴와 수량을 입력받아 list에서 메뉴의 가격을 찾아와
		 * order 메뉴 / 수량*list의 가격을 price에 저장
		 * */
		System.out.println("주문할 메뉴:");
	    String menu = scan.next();
	    System.out.println("수량:");
	    int quantity = scan.nextInt();
	    
	    //해당 menu에 대한 price를 찾아와야 함 =>list에 getPrice()
	   for (Sale<String,Integer> s :  list) {
		   if (s.getMenu().equals(menu)) {
			   int price = s.getPrice()*quantity;
			   order.add(new Sale<>(menu, price));
			   System.out.println("주문완료");
		   return;
	   }
	}
	   System.out.println("없는 메뉴입니다.");
	}
	public void orderPrint() {
		// order 출력
		// 마지막에 총지불금액
		int total = 0;
	    for (Sale<String, Integer> s : order) {
	       System.out.println(s);
	       total += s.getPrice();
	    }
	    System.out.println("총 지불 금액: " + total);
	}
	}
