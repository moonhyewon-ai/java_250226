package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import day15.Student;

public class StreamEx01 {

	public static void main(String[] args) {
		/*
		 * 여행사 상품 여행비용이 15세 이상은 100만원, 15세 미만은 50만원으로 계산 고객 5명이 패키지 여행을 떠난다고 했을 경우 1.비용을
		 * 계산 => 출력 2.고객명단 출력
		 * 
		 * 고객(Customer) 클래스 생성 ArrayList로 관리
		 * 
		 * 예)이름 : 홍길동 나이 :40 비용:100
		 * 
		 * 총 여행경비 : 000
		 * 
		 * 3.20세 이상의 고객 명단 => 이름 순으로 정렬
		 */
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("홍길동", 40));
		list.add(new Customer("이순신", 25));
		list.add(new Customer("김순길", 12));
		list.add(new Customer("홍순찬", 18));
		list.add(new Customer("홍수미", 30));

		list.stream().forEach(n-> {
			System.out.println(n);
		});
		int totalCost = list.stream()
				.mapToInt(n->n.getCost())
				.sum();
		System.out.println("총 여행경비 : " + totalCost);

		list.stream()
		    .filter(n->n.getAge()>=20)
		    .sorted(new Comparator<Customer>() {
		    	
		    	@Override
				 public int compare(Customer o1, Customer o2) {
					
					return o1.getName().compareTo(o2.getName());
				}
			})
		.forEach(s -> System.out.println(s));
		    }
		
	}

