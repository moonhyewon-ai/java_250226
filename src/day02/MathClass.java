package day02;

public class MathClass {

	public static void main(String[] args) {
		// 수학관련 기능이 있는 클래스
		// Math.method
		// Math.round(반올림) / Math.ceil (올림) / Math.floor(버림)
		// 소수 자리수는 무조건 0
		
		double num = 3.14258;
//		long roundNum = Math.round(num);  //return long
		int roundNum = (int)Math.round(num);
        System.out.println(roundNum);
        
//        double ceilNum = Math.ceil(num);  //return double
        int ceilNum = (int)Math.ceil(num);
        System.out.println(ceilNum);
        
        int floorNum = (int)Math.floor(num);
        System.out.println(floorNum);
        
        System.out.println("------------");
        
        //Math.max(최대값) / Math.min(최소값)
       System.out.println(Math.max(3, 5)); 
       System.out.println(Math.min(3, 5)); 
       
       System.out.println("------------");
       
       //Math.random() : 0과1 사이의 아무런 값을 리턴
       // 0 <= Math.random() < 1
       // (int)(Math.random()*count) + start
       System.out.println(Math.random());
       System.out.println((int)Math.random()*10);  //이렇게 되면 형변환이 먼저 돼서 값은 항상 0이나옴
       System.out.println((int)(Math.random()*10)); //괄호로 우선순위를 정해주면 됨! >> 0안 나오게 하려면 마지막에 +1까지 해주면 1~10까지의 숫자나옴
       System.out.println((int)(Math.random()*6)+1); //1~6가지의 랜덤수
	}

}
