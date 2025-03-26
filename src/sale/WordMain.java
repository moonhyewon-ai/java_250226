package sale;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMain {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Map<String, String> dictionary = new HashMap<>();
	        
	        dictionary.put("apple", "사과");
	        dictionary.put("banana", "바나나");
	        dictionary.put("cherry", "체리");
	        dictionary.put("dog", "개");
	        dictionary.put("elephant", "코끼리");

	        while (true) {
	            System.out.println("1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4. 단어 출력 | 5. 단어 삭제 | 6. 종료");
	            System.out.print("선택: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); 

	            if (choice == 1) {
	                System.out.print("단어: ");
	                String word = sc.nextLine();
	                System.out.print("뜻: ");
	                String meaning = sc.nextLine();
	                dictionary.put(word, meaning);
	                System.out.println(word + " 등록됨");
	            } else if (choice == 2) {
	                System.out.print("검색 단어: ");
	                String word = sc.nextLine();
	                System.out.println(dictionary.getOrDefault(word, "단어 없음"));
	            } else if (choice == 3) {
	                System.out.print("수정할 단어: ");
	                String word = sc.nextLine();
	                if (dictionary.containsKey(word)) {
	                    System.out.print("새 뜻: ");
	                    String newMeaning = sc.nextLine();
	                    dictionary.put(word, newMeaning);
	                    System.out.println(word + " 수정됨");
	                } else {
	                    System.out.println("단어 없음");
	                }
	            } else if (choice == 4) {
	                dictionary.
	            } else if (choice == 5) {
	                System.out.print("삭제할 단어: ");
	                String word = sc.nextLine();
	                if (dictionary.remove(word) != null) {
	                    System.out.println(word + " 삭제됨");
	                } else {
	                    System.out.println("단어 없음");
	                }
	            } else if (choice == 6) {
	                System.out.println("종료");
	                break;
	            } else {
	                System.out.println("잘못된 입력");
	            }
	        }
	    }
}

	    
	