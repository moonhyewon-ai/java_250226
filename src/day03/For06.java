package day03;

public class For06 {

	public static void main(String[] args) {
		/* 배수 : 값을 1부터 곱해서 나오는 값
		 * 10의 배수 : 10 20 30 40 ... 1*10 2*20 3*20...
		 * 15의 배수 : 15 30 45 60 ... 1*15 2*15 3*15...
		 * 공배수 : 두 수의 공통된 배수 30 60 90
		 * 최소 공배수 : 30
		 * 
		 */
		int num1 =10;
		int num2 = 15;
		
		for(int i=num2; ; i=i+num2) {           //최소공배수는 시작을 큰 수로 설정 //i=i+num2 > 15+15, 30+15...
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
