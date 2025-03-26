//package javaProject;
//
//import java.util.Scanner;
//
//public class MemoryGame {
//
//    private String answer;  
//
//   
//    public void start() {
//        System.out.println("\n 기억력 테스트 시작!\n");
//
//        answer = generateRandomCode(5); // 5자리 랜덤 문자열 생성  / 정답도 되고 퀴즈도 됨 (겸용)
//        // 만약에 퀴즈가 미리 만들어져있었다면 퀴즈에 넣었겠지만 이건 랜덤으로 생성하고 바로 맞혀야 하므로 answer에 들어가는 것임
//        // 얘는 문제 자체가 정답인 구조이기 때문에 가능한 것
//        System.out.println("3초 동안 아래 문자열을 외우세요!");
//        System.out.println("> " + answer); // 사용자에게 정답 문자열 보여주기
//
//        waitSeconds(3); // 3초 대기
//        clearScreen();  // 화면 지우기 효과
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("입력 >> ");
//        String input = sc.next();
//      
//        // 입력값과 정답 비교
//        if (input.equalsIgnoreCase(answer)) {
//            System.out.println("\n 정답입니다! 축하합니다, 게임 탈출 성공! ");
//        } else {
//            System.out.println("\n 틀렸습니다! 정답은 [" + answer + "] 이었습니다.");
//            System.out.println("아쉽지만 탈출 실패입니다...");
//        }
//    }
//
//    // 랜덤한 문자열 생성 메서드
//    private String generateRandomCode(int length) { //대문자/숫자 조합 랜덤 생성
//        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // 사용할 문자 목록
//        StringBuilder sb = new StringBuilder(); // 문자열을 하나씩 추가할 StringBuilder
//        //String은 a라는 거 하나 그담에 ab라는 거 하나 이렇게 하나씩 계속 만드는 느낌이면 빌더는 그냥 문자열을 갖다 붙이는 느낌
//        for (int i = 0; i < length; i++) {
//            int index = (int)(Math.random() * chars.length()); // 랜덤 인덱스 선택
//            sb.append(chars.charAt(index)); // 랜덤 문자 추가
//        }
//        return sb.toString(); // 완성된 문자열 반환  /StringBuilder가 가진 내용을 String으로 바꿔서 반환하는 메서드
//    }
//
//    // 일정 시간 대기시키는 메서드
//    private void waitSeconds(int seconds) {
//        try {
//            Thread.sleep(seconds * 1000); // 밀리초 단위로 변환 후 대기 ( sleep은 밀리초 단위로만 입력을 받음 )
//            //3초 대기하고 싶다면 → 3000ms = 3 * 1000 / 위에는 1초 대기
//        } catch (InterruptedException e) {
//            e.printStackTrace();  //Thread.sleep()은 예외가 발생할 수 있는 메서드이기 때문에, 반드시 try-catch로 감싸야 함.
//        }
//    }
//
//    // 화면을 지우는 듯한 효과를 주기 위한 메서드 (줄바꿈 반복)
//    private void clearScreen() {
//        for (int i = 0; i < 30; i++) {
//            System.out.println(); // 줄바꿈 여러 번 출력해서 이전 내용 밀어냄
//        }
//    }
//}