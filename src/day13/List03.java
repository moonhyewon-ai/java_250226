package day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		/* 오늘 하루 일과를 저장하는 list를 생성
		 * 출력 => 향상된 for / iterator
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("샤워");
		list.add("화장");
		list.add("옷 입기");
		list.add("버스 타기");
		list.add("지하철 타기");
		
		System.out.println("--향상된 for문 출력--");
		for(String t : list) {  
			System.out.println(t);
		}
		
		System.out.println("--Iterator 출력--");
	  Iterator<String> iterator  = list.iterator();
	  while (iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
	
	list.sort(new Comparator<String>() {
		
		@Override
		 public int compare(String o1,String  o2) {
			//compareTo
			//o1.compareTo(o2) : 오름차순
			//o1.compareTo(o1) : 내림차순
			return o1.compareTo(o2);
		}
	});
	System.out.println(list);
}
}




