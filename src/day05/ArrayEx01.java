package day05;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 파일명을 저장하고 있는 배열이 주어졌을 때 
		 * 검색어를 입력하면 해당 검색어를 포함하는 파일을 출력
		 * 만약 검색결과가 없으면 => 검색결과가 없습니다. 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] fileName = {"이것이자바다.java","java의 정석.java"
				,"Array.txt","array.java", "String Mathod.txt"
				,"Array Method.jpg","method.png","java Method.java"};
		
		 System.out.print("검색어를 입력> ");
	        String s = sc.nextLine();

	        boolean find = false;       //아직 검색 결과 없음을 의미
	        
	        for (String file : fileName) {    //향상된 for문으로 출력
	            if (file.toLowerCase().contains(s)) {   //대소문자 구별없이 사용하려고 할 때
	                System.out.println("검색 결과: " + file);
	                find = true;                 //검색이 있다없다는 검색이 끝난 후에 판단할 수 있음
	            }
	        }
	        if (!find) {
	            System.out.println("검색결과가 없습니다.");
	        }

	        sc.close();
	    }
	}

   //CRUD
   /* Create (생성)
    * Read (읽기 검색)
    * Update (수정)
    * Delete (삭제)
    */
