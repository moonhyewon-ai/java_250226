package day01;

public class Variable {

	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형 변수명;
		 * 
		 * 변수 선언 + 초기화
		 * 자료형 변수명 = 값;
		 * 
		 * 기본 데이터타입은 초기화 해야 사용 가능.
		 * */
		
		int num = 1;//선언 + 초기화
//		int num = 2; //중복 선언 불가능
		System.out.println(num);
		
		int num1 = 3, num2=5,num3=10;
		System.out.println(num1);
		
		num2 = 10; // =(대입연산자) 오른쪽 값을 왼쪽 변수에 저장(덮어쓰기)
		System.out.println(num2);
		
	//char : 아스키코드(유니코드) 표와 한 글자만 가능.
		//"문자열", '한글자'
		
	 char ch ='a';
	 System.out.println(ch);
	 System.out.println((int)ch); //char -> int로 형변환
	 
	 //double
	 double dou = 3.1;
	 System.out.println(dou);
	 
	 byte b =3;
	 System.out.println(b);
	 
	 boolean boo = true; //true false로만 저장 가능
	 System.out.println(boo);
	 
	 //float / long 접미사를 붙여야 사용 가능
	 // float (f F) / long (l L)
	 
	 float f= 1.2f;
	 System.out.println(f);
	 long l = 11L;
	 System.out.println(l);
	 
	 //기본자료형 8가지 지역변수 범위 { }
	 
	}

}
