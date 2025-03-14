package day07;

public class Method05 {
	// 두 정수를 입력받아, 최대공약수를 리턴하는 메서드
	public static int gcd(int num1,int num2) {
		
		int gcd =0; 
		
		for(int i=1; i<=num1; i++) {                   //최대 공약수일 때 더 작은 숫자까지 범위 잡는 게 좋음
			if( num1%i==0 && num2%i==0) {
				gcd =i;                            //공약수 찾으면 gcd값 업데이트
				                                   //최대공약수는 모든 약수를 찾고, 그중 가장 큰 값을 저장하는 방식이라 
				                                   //for문 끝날 떄까지 모든 i값을 검사하면서 갱신하게 됨
			}
			
		 }
		return gcd;                              //최종적으로 가장 큰 공약수가 gcd변수에 저장되므로, 반복문이 끝난 후 return gcd;해주는 거임
	}
	// 두 정수를 입력받아, 최소공배수를 리턴하는 메서드
    public static int lcm(int num1,int num2) {
    	for(int i=num2; ; i=i+num2) {           //최소공배수는 시작을 큰 수로 설정 //i=i+num2 > 15+15, 30+15...
    		if(i%num1==0 && i%num2==0) {
    			return i;                       //최소공배수는 "처음으로 발견되는 공배수"를 찾으면 바로 반환하면 됨
    			                                //return이 for문 밖에 있게되면 for문이 무한루프를 돌게됨 
    			                                //return은 for문을 끝내는 break;의 역할을 함.
    		}	
	}
    }
	public static void main(String[] args) {
		/* 최대공약수,최소공배수 리턴
		 * 
		 */
		int num1=6;
		int num2 =12;
		
		int gcd = gcd(num1,num2);             //반환된 값을 변수에 저장
		int lcm=lcm(num1,num2);
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
}
		 
