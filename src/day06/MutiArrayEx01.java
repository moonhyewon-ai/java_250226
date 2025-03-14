package day06;

import java.util.Scanner;

public class MutiArrayEx01 {

	public static void main(String[] args) {
		/* 성적표
		 * 몇 명의 성적을 출력할지 결정 >3
		 * 이름 국어 영어 수학 총점 평균 석차     >>syso로 모양만 출력
		 * hong 89 90  85  00  00  0      >>실제값은 이거  (n행7열)
		 * choi 89 90  85  00  00  0
		 * park 89 90  85  00  00  0
		 * "\t" : 탭(띄어쓰기)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명의 성적을 출력할지 결정 >");
		int num = sc.nextInt();
		
		String[] names = {"hong", "choi", "park"}; 
        int[][] arr = new int[num][6]; 
		
		//1~100까지 중의 랜덤수를 채워 출력
//				int arr[][] = new int[3][7];
        
        for (int i = 0; i < num; i++) {
        	
            arr[i][0] = (int)(Math.random() * 50)+50; // 국어
            arr[i][1] = (int)(Math.random() * 50)+50; // 영어
            arr[i][2] = (int)(Math.random() * 50)+50; // 수학
            arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2]; // 총점
            arr[i][4] = arr[i][3] / 3; // 평균
            
        }

				
				System.out.println("이름" + "\t" + "국어" + "\t"+ "영어" +"\t"+ "수학" +"\t"+ "총점" +"\t"+ "평균" +"\t"+ "석차");
				
				for(int i=0; i<arr.length; i++) {     
						
						int c = 1;
						//석차
						for (int j=0; j<num; j++) {
							if(arr[i][3] < arr[j][3]) {
								c++;
								//System.out.println(c);
							}
							arr[i][5]=c;
							
//						System.out.print(arr[i][5]);  
						}
						System.out.print(names[i]  + "\t");
						for(int j=0; j<arr[i].length; j++) {    
							System.out.print(arr[i][j] + "\t");  
					}
					
					System.out.println();
				}

	}

}
