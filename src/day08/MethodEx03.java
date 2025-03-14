package day08;

import java.util.Arrays;

public class MethodEx03 {

	public static void main(String[] args) {
		/* 로또번호 생성
		 * 1~45 까지 중 6개 번호 생성
		 * 당첨번호와 사용자 번호 비교해서 등수 추출
		 * 6개 모두 일치 : 1등
		 * 5개 일치 + 보너스 : 2등
		 * 5개 일치 : 3등
		 * 4개 일치 : 4등
		 * 3개 일치 : 5등
		 * 나머지 꽝
		 */
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int[6]; //사용자 로또 번호
		
		createArray(lotto);
		createArray(user);
		
		System.out.println("당첨번호 : " + Arrays.toString(Arrays.copyOf(lotto, 6)) + " [보너스: " + lotto[6] + "]");
        System.out.println("사용자 번호 : " + Arrays.toString(user));


		 int rank = checkRank(lotto, user); // 등수 확인

	        if (rank == 0) {
	            System.out.println("결과: 꽝");
	        } else {
	            System.out.println("결과: " + rank + "등");
	        }
	}
/* 랜덤 배열 채우기(1~45)까지
 * 배열을 받아서 랜덤 수를 채우는 메서드 (중복 불가능)
 * 매개변수 : 배열 => int arr[]
 * 리턴타입 : void 
 * 메서드명 : randomArray
 */
	public static void createArray(int arr[]) {
		//while 사용
		int cnt =0; // i 역할을 할 변수
		while(cnt<arr.length) {
			//랜덤 생성
			int r = (int)(Math.random()*46);
			if(!isContain(arr,r)) {
				arr[cnt]=r;
					cnt++;
			}
		}
	}
	/*중복 확인 메서드
     * 배열과 랜덤값을 입력받아 
     * 배열에 랜덤값이 존재하면 true / 없으면 false 를 리턴
     * 매개변수 : 배열, 랜덤값 => int arr[], int random
     * 리턴타입 : boolean
     * */
	public static boolean isContain(int arr[],int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
		}
	
		return false;
	}

	/* 배열 출력 메서드
	 * user : 1 2 3 4 5 6
	 * 당첨 : 1 2 3 4 5 6 [7]  
	 */
	public static void printArray(int[] arr, boolean isLotto) {
	    for (int i = 0; i < arr.length; i++) {
	        if (isLotto && i == arr.length - 1) {
	            System.out.print("[" + arr[i] + "] "); // 마지막 요소 (보너스 번호) 대괄호로 출력
	        } else {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    System.out.println();
	}
	/* 등수 확인 메서드
	 *  * 당첨번호와 사용자 번호 비교해서 등수 추출
		 * 6개 모두 일치 : 1등
		 * 5개 일치 + 보너스 : 2등
		 * 5개 일치 : 3등
		 * 4개 일치 : 4등
		 * 3개 일치 : 5등
		 * 나머지 꽝
	 */
	public static int checkRank(int lotto[], int user[]) {
        int matchCount = 0; // 맞춘 개수
        boolean bonusMatch = false;

     // 사용자 번호와 당첨번호 비교
        for (int i = 0; i < user.length; i++) {
        	 if (isContain(Arrays.copyOf(lotto, 6), user[i])) {
                matchCount++;
            }
        }
//보너스 번호 
	 if (isContain(user, lotto[6])) {
         bonusMatch = true;
     }

     // 등수 판별
     switch (matchCount) {
         case 6:
             return 1; // 1등
         case 5:
             return bonusMatch ? 2 : 3; // 2등 (보너스 맞춤) / 3등 (보너스 없음)
         case 4:
             return 4; // 4등
         case 3:
             return 5; // 5등
         default:
             return 0; // 꽝
     }
	}

}
