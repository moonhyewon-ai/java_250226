package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 숫자를 입력받아 (0이나 -숫자를 입력하면 종료)
		//입력받은 숫자의 합계와 평균을 출력
		//ex) 3+ 5+ 4+ 8+ 9 = 합, 평균 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int count=0;
		
		
while (true) {
    System.out.print("입력 숫자> ");
    int num = sc.nextInt();
    
    if (num <= 0) {
        System.out.println("종료");
        break;
    }
    
    sum += num; 
    count++;    
}

if (count > 0) { 
    int avg =sum / count;
    System.out.println("합계: " + sum);
    System.out.println("평균: " + avg);
} else {
    System.out.println("입력된 숫자가 없습니다.");
}

sc.close();
}
}