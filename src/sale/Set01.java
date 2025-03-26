package sale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set : 순서보장X (index가 없음), 중복불가능.
		 * 순서가 없다는 건 정렬이 안 된다는 것. 정렬X
		 * HashSet(대표적인 구현 클래스) / TreeSet(정렬이 가능한 set)
		 * 
		 */
       HashSet<String> set = new HashSet<String>();
       
       //add() : set에 객체 추가
       set.add("apple");
       set.add("apple");
       set.add("banana");
       set.add("peach");
       set.add("orange");
       set.add("apple");
       System.out.println(set);
       
       //get(i) / set(i,value) : index가 없어서
       //index를 사용하는 메서드가 없음.
       for(String tmp : set) {
    	   System.out.println(tmp);
       }
       
       //Iterator 출력 가능.
       Iterator<String> it = set.iterator();
       while(it.hasNext()) {
    	   String t= it.next();
    	   System.out.println(t);
       }
       
       //정렬 : set은 순서가 없기 때문에 정렬 불가능.
       //set => list로 변환하여 정렬
       List<String> list = new ArrayList<String>(set);
       System.out.println(list);
       
       Collections.sort(list);
       System.out.println(list);
       
       //list.sort() 로 내림차순 정렬하여 출력
       list.sort(new Comparator<String>() {
   		
   		@Override
   		 public int compare(String o1,String  o2) {
   			
   			return o1.compareTo(o1);
   		}
   	});
   	System.out.println(list);
   }
	}


