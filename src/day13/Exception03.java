package day13;

public class Exception03 {

	public static void main(String[] args) {
		// 0으로 나누었을 때 발생하는 예외 처리
		// ex) num1 =1, num2=3, op='+' => 4
		// 예외처리로 출력
		// num1 = 3, num2 =0, op ='/' => 오류 메시지 출력
		// num1 = 3, num2 =0, op ='%' => 오류 메시지 출력
		System.out.println(calculate(1, 3, '+'));
		System.out.println(calculate(1, 3, '-'));
		System.out.println(calculate(3, 0, '/'));
		System.out.println(calculate(3, 0, '%'));

	}

	/* 메서드에서 예외 발생시키기 : throw new 발생 시킬 수 있음
	 * throw : 예외 떠넘기기 (예외를 나를 호출하는 다른 메서드로 넘김)
	 * 예외를 발생시키게 되면 메서드 선언부 끝에 throws를 적고, 발생할 수 있는 예외를 반드시 적어줘야 함.     
	 * throws는 예외적으로 runtimeException 만 생략가능.
	 * 메서드 : 두 수를 입력받고, 연산자를 입력받아 4칙 연산의 결과를 리턴하는 메서드 
	 * 매개변수 : 두 정수, 연산자 => int num1,int num2, char op 리턴타입 : double
	 */

	public static double calculate(int num1, int num2, char op) {
	    try {
	    	switch (op) {
          case '+':
              return num1 + num2;
          case '-':
              return num1 - num2;
          case '*':
              return num1 * num2;
          case '/':
              if (num2 == 0) {
                  throw new ArithmeticException("0으로 나눌 수 없습니다.");
              }
          case '%':
                  if (num2 == 0) {
                      throw new ArithmeticException("0으로 나눌 수 없습니다.");
                  }
          default:
      }
	    }catch (Exception e) {
    	  System.out.println("예외 발생: " + e.getMessage());  
      }
		return 0;
	}
}
