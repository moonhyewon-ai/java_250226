package day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date02 {

	public static void main(String[] args) {
		// LocalDateTime 클래스
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		
		//객체를 String 으로 변환
		String date = today.toString();
		System.out.println(date);
		
		//subString 사용하여
		//날짜 2025-03-14 / 시간 15:28:19 으로 분리하여 출력
		
		
		
		System.out.println();
		
		LocalDate t = LocalDate.now();
		System.out.println(t);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
}

}
