package day04;

public class StringEx01 {

	public static void main(String[] args) {
		/* regNum의 주민등록번호를 참고하여
		 * 생년월일과 성별을 출력
		 * 
		 */
		
		String regNum = "990101-1234567";   //1=남자 /2=여자
		String regNum1 ="020101-4567896";   //3=남자 /4=여자
		System.out.println("생년월일 :" +regNum.substring(0,regNum.indexOf("-")));
		System.out.println("생년월일 :" +regNum1.substring(0,regNum.indexOf("-")));
		int num=1;
		System.out.println(regNum.charAt(7));
//		if (num==1) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
//		int num1=4;
//		System.out.println(regNum1.charAt(7));
//		if (num1==4) {
//			System.out.println("여자");
//		}else {
//			System.out.println("남자");
//		}
		if(num.equals("1") || num.equals("3")) {
			System.out.println("성별 : 남");
		}else {
			System.out.println("성별 : 여");
		}
	}
}
