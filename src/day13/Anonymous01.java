package day13;

public class Anonymous01 {

	public static void main(String[] args) {
		/* 익명클래스 (Anonymous class) : 내부클래스의 일종
		 * 나중에 다시 객체를 생성할 일이 없는 것을 의미.
		 * 한 번 쓰고 버려지는 객체(일회용 클래스)
		 * 
		 * 인터페이스를 사용하여 객체를 생성할 경우
		 * -인터페이스의 구현 외 다른 구현이 없고,
		 * -해당 객체를 하나만 사용하는 경우
		 * -인터페이스의 기능이 적은 경우
		 * -다른 객체의 매개변수로 사용하는 케이스에서 주로 사용
		 */
		
		

		public void product(Power p) {
			p.turnOn();
			
			p.turnOff();
			
		}
	}

}
