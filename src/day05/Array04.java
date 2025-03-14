package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성
		 * 1~50까지의 랜덤 수를 배열에 저장 => 출력
		 * 합계,평균,최대,최소 출력
		 */
		
		int arr[] = new int[10];  //1.배열 생성
		
		 
	        int sum = 0;
	        int max = 0; 
	        int min =51;   //최소값은 랜덤 수 50보단 커야 됨
	        
	        for (int i=0; i<arr.length; i++) {
	        	arr[i] = (int)(Math.random()*50)+1;
	        	System.out.println(arr[i]);      //2.배열에 랜덤값 저장 =>10개
	        	                                 //3.합계,평균,최대,최소 구하기
	        }
	  
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];

	            max = Math.max(max,arr[i]);
	            min = Math.min(min,arr[i]);
	            }

	            System.out.println("합계: " + sum);
	            System.out.println("평균: "+ (double) sum / arr.length);
	            System.out.println("최대값: " + max);
	            System.out.println("최소값: " + min);           //4.출력

	    
	}

}
