package word;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 단어장 프로그램
		 * 하나의 단어에 뜻이 여러개 등록
		 * class 활용.
		 * Map<String, ArrayList<String>> map
		 * 
		 * 1.단어등록 |2.단어검색 |3.단어수정|
		 * 4.단어출력 | 5.단어삭제 | 6.단어를 파일로 출력 |7.종료
		 * WordController를 생성하여 메서드 구현
		 * 기본단어 5가지 등록
		 * 
		 * Map으로
		 * 
		 */
		Scanner sc = new Scanner(System.in);
        WordController wc = new WordController();
        
  
        while(true) {
        	System.out.println("1.단어등록");
        	System.out.println("2.단어검색");
        	System.out.println("3.단어수정");
        	System.out.println("4.단어출력");
        	System.out.println("5.단어삭제");
        	System.out.println("6.단어를 파일로 출력");
        	System.out.println("메뉴 선택 >");
        	
        	int choice = sc.nextInt();
        	sc.nextLine();
        	
        	switch(choice) {
        	case 1:
        		System.out.println("단어 입력: ");
        		String wordToAdd = sc.nextLine();
        		System.out.println("단어의 의미 입력: ");
        		String meaningToAdd = sc.nextLine();
        		wc.add(wordToAdd,meaningToAdd);
        		break;
        		
        	case 2:
        		System.out.println("검색할 단어 입력 : ");
        		String wordToSearch = sc.nextLine();
        		wc.searchWord(wordToSearch);
        		break;
        		
        	case 3:
        		System.out.println("수정할 단어 입력 : ");
        		String wordToUpdate = sc.nextLine();
        		System.out.println("새로운 의미 입력 : ");
        		String newMeaning = sc.nextLine();
        		wc.updateWord(wordToUpdate,newMeaning);
        		break;
        		
        	case 4:
        		wc.printWords();
        		break;
        		
        	case 5:
        		System.out.println("삭제할 단어 입력 : ");
        		String wordToDelete = sc.nextLine();
        		wc.deleteWord(wordToDelete);
        		break;
        		
        	case 6:
        		System.out.println("저장할 파일명을 입력하세요 :");
        		String filename = sc.nextLine();
        		wc.saveToFile(filename);
        		break;
        		
        	case 7:
        		System.out.println("종료");
        		sc.close();
        		return;
        		
        	default:
        	   System.out.println("잘못된 입력입니다.");
        	}
        }
 
  }
}
	