package day06;

public class NultiArray02 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 10 11 12
		 * 13 14 15
		 * 자료형 배열명[][] = new 자료형[5][3]; //5행 3열
		 */
		int arr[][] = new int[5][3]; 
		
		int num=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++; 
				System.out.print(arr[i][j] + " ");  
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		//1~50까지 중의 랜덤수를 채워 출력
		int arr1[][] = new int[5][3];
		
		for(int i=0; i<arr1.length; i++) {     //5행
			for(int j=0; j<arr1[i].length; j++) {    //3열
				arr1[i][j] =(int)(Math.random()*51);
				System.out.print(arr1[i][j] + " ");  
			}
			System.out.println();
		}
		
	}

}
