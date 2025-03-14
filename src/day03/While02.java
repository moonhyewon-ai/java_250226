package day03;

public class While02 {

	public static void main(String[] args) {
		/* 1~50짝수 출력
		 * 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * ...
		 * 42 44 46 48 50
		 * 
		 * println(): 줄바꿈이 있는 출력
		 * print() : 줄바꿈이 없는 출력, 출력값이 없으면 error
		 * printf() : 지시자를 이용한 출력, 출력값이 없으면 error
		 * 
		 * 지시자
		 * %d(정수형), %f(실수형), %c(문자), %s(문자열), %n(줄바꿈)
		 * 소수점 설정이 가능함, 공백 추가 가능함
		 */
        int i=1;
        int count=0;
        
//        while(i<=50) {
//        	if(i%2==0) {
//        		System.out.print(" " + i);
//        		count++;
//        	}
//        	if (count%5==0)                               //이런 식으로 괄호 밖에 있으면 홀수 일 때는 건너뛰지만 count함수는 홀수일 때도 세어주기 때문에 
//                                                            띄어쓰기가 또 쓰이게 됨
//                                                           
//        	{System.out.println();}
//        	i++;
//        }
        
        while(i<=50) {
        	if(i%2==0) {
        		System.out.print(i+" ");           //printf면 ("%3d",i);
        		count++;
        		if(count % 5==0) {                    //5개 개수대로 끊어서 사용
        			System.out.println();
        		}
        	}
        	i++;
        }
    System.out.println("----------------");
    
    System.out.printf("%.2f",1.666666);
    
    int a=3;
    int b=5;
    System.out.println(a + "+" + b + "=" +(a+b));
    System.out.printf("%d+%d=%d",a,b,(a+b));
    
    System.out.println("----------------");
    
    double score = 89.33333;
    double cnt = 5;
    
    System.out.printf("%.1f / %.0f = %.2f%n", score, cnt, (score/cnt));
	}

}
