package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 
		 * 1~50까지의 랜덤 수 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤 수 생성 : 23
		 * 입력 > 10
		 * up!!
		 * 입력> 20
		 * up!!
		 * 입력> 30
		 * down!!
		 * 입력> 25
		 * down!!
		 * 입력>23
		 * 정답!!
		 */
		Scanner sc = new Scanner(System.in);
				
		int random = (int) (Math.random() * 100) + 1;              //처음 랜덤 수가 하나 정해지면
		int count =0;
		
        while(true) {
        	System.out.println("입력>");                             //입력도 정답이 나올 때까지 반복해서 입력 받아야 함
        	int num =sc.nextInt();
        	
        	count++;
        	if(count % 1==0) {                    
    			System.out.println(count+"회차");
    		}
        	
        	if (num < random) {                                     //입력한 수가 랜덤수보다 작으면 업!!
        		System.out.println("up!!");
        	}else if (num > random) {
        		System.out.println("down!!");
        	}else {
        	System.out.println("정답!!");   
        	break;                                                   //while문 반복문이 끝나면 break 선언 잊지 않기
        }
	}
	}
}

