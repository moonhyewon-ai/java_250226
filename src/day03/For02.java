package day03;

public class For02 {

	public static void main(String[] args) {
		// for 예제
		//for( 1초기화; 258조건식; 47증감식){
		//     36실행문;
		// }
		// 조건식은 참이어야 실행 (true가 될 수 있게 설정)
		// 조건식이 초기화 한 변수가 조건식을 만족하면 실행 -> (증가/감소)
		// 증가한 변수를 다시 조건식 비교 -> 만족하면 실행 -> 증감식
		// 증가한 변수를 다시 조건식 비교 -> 불만족하면 -> 종료
		for (int i=1; i<=10; i++) {
			if(i%2==0) {
			System.out.println(i);
			}
	}
		System.out.println("-----------");
		
		int sum= 0;
		
		for(int i =1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("-----------");
		// 1~10까지 짝수합 / 홀수합 출력
		int even = 0;
		int odd =0;
		
		for (int i=1; i<=10; i++) {
			if(i%2==0) {
				even += i;
			}else{
		        odd +=i;
		}
	}
		System.out.println("짝수 합 : " + even); 
		System.out.println("홀수 합 : " + odd); 

}
}