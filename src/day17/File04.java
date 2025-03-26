package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class File04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* test.txt 파일을 읽어들여 map에 저장
		 * 명단 출력 / 합계 / 평균 출력
		 * 일겅 들이는 파일은 모두 String
		 * 점수는 => int => 계산이 가능.
		 * Integer.parseInt()
		 * 점수가 80점 이상인 학생 명단
		 * 
		 */
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\web_0226_MHW\\memo\\test.txt"));
		Map<String, Integer> map = new HashMap<>();
		
		String line;
		
		while ((line = br.readLine()) != null) {
		    String[] data = line.split(" ");
		    String name = data[0];
		    int score = Integer.parseInt(data[1]);
		    map.put(name, score);
		}
		br.close();
		
		System.out.println("==명단 출력==");
		for (String key : map.keySet()) {
			System.out.println(key +":" + map.get(key));
		}
			
			
		int sum = 0;
		for (int score : map.values()) {
		    sum += score;
		}
		double avg = (double) sum / map.size();
	
			
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);	
		
		//점수가 80점 이상인 학생 명단
		System.out.println("==\n80점이상 명단==");
		for (String key : map.keySet()) {
			if(map.get(key) >=80) {
				System.out.println(key + ":" + map.get(key));
			}
		}
	}

}
