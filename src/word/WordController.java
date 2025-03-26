package word;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController {
	
	
	private Map<String, List<String>> map = new HashMap<>();
	
	public WordController() {
	    add("apple", "사과");
	    add("banana", "바나나");
	    add("kiwi", "키위");
	    add("orange", "오렌지");
	    add("dog", "강아지");
	}
	
	public void insertWord(Scanner sc) {
		// 단어등록
		System.out.println("단어>");
		String word = sc.next();
		System.out.println("뜻>");
		String mean = sc.next();
		
		add(word, mean);
		System.out.println("--단어추가 완료");
	}
	
	public void searchWord(Scanner sc) {
		// 단어검색
		System.out.println("검색 단어>");
		String word = sc.next();
		// key에 값이 존재하는지 확인 : true / false
		if(map.containsKey(word)) {  
			System.out.println("--검색결과--");
			System.out.println(word+":"+map.get(word));
			return;
		}
		System.out.println("검색결과가 없습니다.");
		
	}

	public void searchWord(String word) {
	    word = word.toLowerCase();
	    
	}
	    
//	for(int i=0; i<studentList.size(); i++) {
//		if(studentList.get(i).equals(new Student(num))) {
			//내가 수강신청한 목록 출력
	//리스트로 하면 equals로
	
	public void modifyWord(Scanner sc) {
		// 단어수정
		// set이 없음. => 삭제 후 추가
		System.out.println("수정할 단어>");
		String word = sc.next();
		// 삭제 값이 없으면 = null / 삭제 값이 있으면 value return
		if(map.remove(word) == null) {
			System.out.println("수정할 단어가 없습니다.");
			return;
		}
		System.out.println("뜻>");
		String mean = sc.next();
		add(word, mean);
		System.out.println("--수정완료");
	}

	public void printWord() {
		// 단어출력
		int cnt=0;
		System.out.println("--단어장--");
		for(String s : map.keySet()) {
			cnt++;
			System.out.println(cnt+"."+s+":"+map.get(s));
		}
		System.out.println("--------------");
		
	}

	public void deleteWord(Scanner sc) {
		// 단어삭제
		System.out.println("삭제할 단어>");
		String word = sc.next();
		// 삭제 값이 없으면 = null / 삭제 값이 있으면 value return
		if(map.remove(word) == null) {
			System.out.println("삭제할 단어가 없습니다.");
			return;
		}
		System.out.println("--삭제완료");
	}

	// 단어를 파일로 출력
		public void saveToFile(String filename) {
			try (FileWriter fw = new FileWriter(filename)) {
				for(String key : map.keySet()) {
					fw.write(key + " : " + map.get(key) + "\n");
				}
				System.out.println("단어가 파일에 저장되었습니다: " + filename);
			} catch(IOException e) {
				System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
			}
		}
	
	
	
	public void add(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	

	public void updateWord(String wordToUpdate, String newMeaning) {
		// TODO Auto-generated method stub
		
	}


	public void printWords() {
		// TODO Auto-generated method stub
		
	}

	public void deleteWord(String wordToDelete) {
		// TODO Auto-generated method stub
		
	}

	
}
