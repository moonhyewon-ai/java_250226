package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 정수2개와 연산자1개를 입력받아 두 정수의 연산 결과를 출력
		 * ex) 2 3 + (입력값) => 2+3=5 (출력값)
		 * ex) 2 2 * => 2*3=6
		 * 연산자는 + - * /  % 만 가능
		 * 다른 종류의 특수문자가 들어오면 잘못된 연산자로 출력
		 */
		
		//문자로 받는 케이스 : String == 비교 불가능
		//한 글자만 받는 케이스 : char == 비교 가능
		//scan.next() : 한 단어를 입력
		
     Scanner sc = new Scanner(System.in);
//     String s=  sc.next();   //abc
     
     
     System.out.print("두 정수와 연산자를 입력하세요>");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     char c = sc.next().charAt(0);

     if( c!= '+' && c!= '-' && c!= '*' && c!= '/' && c!= '%') {                     //char연산자 작은따옴표!
    	 System.out.println("잘못된 연산자");
     }else {
    	 System.out.println("입력받은 연산 결과:");
    	 switch(c) {
 		case '+' :
 			System.out.println(num1 + "+" +  num2 + " = " + (num1 + num2));                //문자열 큰따옴표!
 			break;
 		case  '-':
 			System.out.println(num1 + "-" +  num2 + " = " + (num1 - num2));
 			break;
 		case '*':
 			System.out.println(num1 + "*" +  num2 + " = " + (num1 * num2));
 			break;
 		 case '/':
              if (num2 != 0) {
            	  System.out.println(num1 +"/" +  num2 + " = " + (num1 / num2));
              } else {
                  System.out.println("에러");
              }
              break;
         case '%':
                 if (num2 != 0) {
                	 System.out.println(num1 + "%" +  num2 + " = " + (num1 % num2));
                 } else {
                     System.out.println("에러");
                 }
 			break;
 		}
 		sc.close();
            
         }

	}
}
		
