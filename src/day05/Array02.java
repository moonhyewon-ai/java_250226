package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/*
		 * 5명의 점수를 입력. 1.배열을 생성 2.배열에 점수 입력받기 3.배열을 출력 4.점수의 합계 / 평균
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("점수 입력 (0 이하 입력 시 종료): ");
			int num = sc.nextInt();

			if (num <= 0) {
				System.out.println("입력 종료");
				break;
			}

			arr[i] = num;
			sum += num;
			count++;
		}

		System.out.print("입력된 점수: ");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		if (count > 0) {
			double avg = (double) sum / count;
			System.out.println("합계: " + sum);
			System.out.printf("평균: " + avg);
		} else {
			System.out.println("입력된 점수가 없습니다.");

		}

//int[] arr = new int[5];  
//int sum = 0;
//Scanner sc = new Scanner(System.in);
//
//for (int i = 0; i < arr.length; i++) {
//	arr[i] =sc.nextInt();  //합계 누적
//	sum = sum + arr[i];  
//}
//for (int i = 0; i < arr.length; i++) {
//    System.out.print(arr[i] +" ");
//}
//System.out.println();
//System.out.println("합계:"+sum+", 평균:"+(sum/(double)arr.length));

//향상된 for문
//번지(index)로 접근이 불가능한 경우 사용
//index를 활용한 기능은 할 수 없음.
//전체 탐색만 가능 (부분 탐색 불가능)
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		
	}
}