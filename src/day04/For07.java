package day04;

public class For07 {

	public static void main(String[] args) {
		// for / while / 
		/*for문을 이용하여 구구단 5단을 출력
		 * 
		 */
		int dan =5;
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(dan + "*" + i +"=" +(dan*i));
		}
		System.out.println("-------------------------------");
		
       // 이중 for문   //dan=2~9까지 반복
		for(int j=2; j<=9; j++) {      //i와 j의 순서를 바꾸면 가로 세로 출력이 달라짐
			for(int i=1; i<=9; i++) {   //int로 선언 잊지 말기!
				System.out.print(j +"*"+ i + "=" + (j*i)+" ");
			}
			System.out.println();   //한 단이 끝나면 줄바꿈
		}
	}
}

