package day07;

public class Method03 {
	/* 두 정수의 합을 리턴하는 메서즈
	 * 
	 */
	public static int sum(int num1,int num2) {
		 
		return num1 + num2;                            //메서드 하나에 리턴값도 하나!!!!!!!!!!!

	}
	//두 정수의 차를 리턴하는 메서드
	public static int minus(int num1,int num2) {
		
		return num1-num2;
	}
	public static int gob(int num1,int num2) {
		
		return num1*num2;
	}
public static int division(int num1,int num2) {
		
		return num2/num1;
	}
public static int mod(int num1,int num2) {
	
	return num2%num1;
}
	

	public static void main(String[] args) {
		/* + - * / % 기능을 하는 메서드를 생성
		 * main에서 호출 => 출력
		 */
		int num1=10, num2=20;
		
		int sum = num1+num2;
		int minus=num1-num2;
		int gob=num1*num2;
		int division =num2/num1;
		int mod=num2%num1;
		
		System.out.println(sum(num1,num2));
		System.out.println(minus(num1,num2));
		System.out.println(gob(num1,num2));
		System.out.println(division(num1,num2));
		System.out.println(mod(num1,num2));
		
	}

}
