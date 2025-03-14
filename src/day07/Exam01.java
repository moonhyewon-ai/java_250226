package day07;

import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* ArrayEx01 에서 했던 야구게암을
         * 메서드 분리 후 실행.
         
     * 자리는 일치 X 숫자만 일치하면 ball
         * 아무것도 맞지 않으면 out
         * ex) com : 1 2 3
         * me : 1 8 9 =>1s   0번지수가 0번지수랑 일치하면 s (if문)
         * me : 9 8 7 => out
         * me : 1 3 2 => 1s 2b
         * me : 1 2 3=> 3s 정답
         */

      Scanner sc = new Scanner(System.in);
          int[] comNum = new int[3]; // 컴퓨터 숫자
          int[] myNum = new int[3];  // 사용자 숫자

          // 컴퓨터 랜덤 숫자 생성
          Random(comNum);
          System.out.println("컴퓨터 숫자가 생성>");

          // 게임 실행
          while (true) {
              // 사용자 숫자 입력
              UserInput(myNum, sc);

              // 숫자 비교
              int strike = countStrike(comNum, myNum);
              int ball = countBall(comNum, myNum);

              // 결과 출력
              if (strike == 0 && ball == 0) {
                  System.out.println("out");
              } else {
                  System.out.println("결과: " + strike + " 스트라이크, " + ball + " 볼");
              }

              // 정답 확인
              if (strike == 3) {
                  System.out.println("3s 정답 , 게임 종료");
                  break;
              }
          }

          sc.close();
      }

  /* 배열을 입력받아 랜덤으로 값이 중복되지 않게(중복확인 메서드 활용) 채우기
      * 랜덤값은 0~9까지(컴퓨터값)
      */
      public static void Random(int[] comNum) {
          Random rand = new Random();
          for (int i = 0; i < comNum.length; i++) {
              comNum[i] = rand.nextInt(10); // 0~9 랜덤 값
              for (int j = 0; j < i; j++) { // 중복 확인
                  if (comNum[i] == comNum[j]) {
                      i--; // 다시 뽑기
                      break;
                  }
              }
          }
      }

      // 사용자 입력 받기
      public static void UserInput(int[] myNum, Scanner sc) {
          while (true) {
              System.out.print("숫자 입력 > ");
              String input = sc.next();

              if (input.length() != 3) {
                  System.out.println("숫자를 입력 >");
              }
              /*중복 확인 메서드
               * 배열과 랜덤값을 입력받아 
               * 배열에 랜덤값이 존재하면 true / 없으면 false 를 리턴
               */

              boolean n = true;
              for (int i = 0; i < 3; i++) {
                  myNum[i] = input.charAt(i) - '0'; // 문자 → 숫자 변환
                  if (myNum[i] < 0 || myNum[i] > 9) {
                      n = false; // 숫자가 아니면 유효하지 않음
                  }
              }

              if (!n || isDuplicate(myNum)) {
                  System.out.println("다른 값을 입력하세요>");
              }
              break;
          }
      }

      // 중복 체크 (사용자 입력 중복 확인)
      public static boolean isDuplicate(int[] arr) {
          return arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2];
      }

      /* 스트라이크 개수를 카운트하는 메서드
       * comNum, myNum 배열을 입력받아 번호와 위치가 일치하면
       * count 값을 리턴하는 메서드
       */
      public static int countStrike(int[] comNum, int[] myNum) {
          int strikeCount = 0;
          for (int i = 0; i < comNum.length; i++) {
              if (comNum[i] == myNum[i]) {
                  strikeCount++;   //번호와 위치가 일치하면 스트라이크
              }
          }
          return strikeCount;
      }

      /* 볼개수를 카운트하는 메서드
       * comNum, myNum 배열을 입력받아 번호만 일치하면
       * count 값을 리턴하는 메서드
       */
      public static int countBall(int[] comNum, int[] myNum) {
          int ballCount = 0;
          for (int i = 0; i < comNum.length; i++) {
              for (int j = 0; j < myNum.length; j++) {
                  if (i != j && comNum[i] == myNum[j]) {
                      ballCount++;  //번호만 일치하면 볼
                  }
              }
          }
          return ballCount;
      }
  }
