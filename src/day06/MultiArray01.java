package day06;

public class MultiArray01 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열 -2차원 배열 배열명[] - 1차원배열 {1,2,3} 배열명[행][열] - 2차원배열 { {1,2,3} , {1,2,3} }
		 * 배열명[][][] - 3차원배열 { { {},{} }, { {}, {} } }
		 * 
		 * { {1,2,3} , {1,2,3} } 
		 * int arr[2][3] = new int[2][3]; 
		 * 출력결과 : 1 2 3 
		 *          1 2 3
		 * 
		 * 배열의 길이
		 * 1차원 배열 = arr.length   => for 1개
		 * 2차원 배열 = arr[i].length => for 2개
		 * 3차원 배열 = arr[i][j].length => for 3개   해석:첫면에(i) 두번째줄에(j) 몇개 있니
		 */
		int arr[][] = { 
				{ 1, 2, 3 },    //0줄  1>1칸, 2>2칸, 3>3칸
				{ 1, 2, 3 }     //1줄
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i+10; //2차원 배열의 값 넣기
				System.out.print(arr[i][j] + " ");  //2차원 배열의 값 출력
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
	}

}
