package sale;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * -값을 2개 쌍으로 저장 , key/value
		 * -key : 중복 불가, value : 중복 가능.
		 * -HashMap을 가장 많이 사용
		 * 
		 * HashMap<클래스, 클래스> map = new HashMap<클래스,클래스>();
		 * -값이 2개이기 때문에 향상된 for문, iterator 사용 안됨.
		 * -map => key => set으로 구성 후 출력
		 * 
		 * list,set => 추가 add() / map=> 추가 put()
		 * get(key) => value
		 * remove(key) => 삭제하면서 value 리턴
		 * 
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("orange", 1000);
		System.out.println(map);
		System.out.println(map.keySet());  //자주 사용
		System.out.println(map.values());
		
		//get(key) =>value
		System.out.println(map.get("apple"));
		
		int sum=0;
	//향상된 for
		for(String key : map.keySet()) {
			sum += map.get(key); //value값을 누적
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("금액합계:" + sum);
	}

}
