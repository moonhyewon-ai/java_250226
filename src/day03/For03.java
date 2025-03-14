package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 구구단 2단
		//2*1=2 / 2*2=4 / 2*3=6... 2*9=18
		
//		int num =2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 받기>");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + "*" + i +"=" +(num*i));	
		}
		
	}

}
