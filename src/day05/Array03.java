package day05;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// arr배열의 합계와 평균을 출력
		// 최대값 / 최소값 출력

        int arr[] = {56, 89, 78, 54, 84, 62, 95, 30, 59, 67, 91};
        int sum = 0;
        int max = arr[7]; 
        int min = arr[7]; 
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
//            if (arr[i] > max) max = arr[i];
//            if (arr[i] < min) min = arr[i];
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
            }

            System.out.println("합계: " + sum);
            System.out.println("평균: "+ (double) sum / arr.length);
            System.out.println("최대값: " + max);
            System.out.println("최소값: " + min);

        }
    }
