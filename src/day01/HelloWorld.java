package day01;

public class HelloWorld {

	public static void main(String[] args) {
		/* console : 출력
		 * println() : 줄바꿈을 포함하는 출력
		 * print(): 줄바꿈이 없는 출력
		 * printf() : 형식을 가지는 출력(C언어에서 주로 사용)
		 * 
		 * 문자열은 " " 한글자 : ' ' 
		 * */
		 System.out.println("Hello World!"); //기본 출력 구문
		 
		 char ch ='a';
		 System.out.println(ch);
		 
		 String s = "abc";
		 System.out.println(s);
		 
		 int a = 1;
		 a = a+1;
		 System.out.println(a);
		 a += 1;
		 System.out.println(a);
		 
		 //변수
		 int num = 100;
		 //int num = 200; 중복 선언 불가능
		 num = 200; //기존 변수값은 덮어쓰기 된다.
		 
		 int num1,num2,num3;
		 num1 = 1;
		 num2 =2;
		 num3 =3;
		 System.out.println(num1+num2+num3);
		 
		 num1++; //num = num1 + 1
		 
		 int num4; // 선언만.
		 
//		 기본자료형 8가지는 초기값을 가지지 않으면 오류남
//		 System.out.println(num4);
		 
		 
		 
	}

}
