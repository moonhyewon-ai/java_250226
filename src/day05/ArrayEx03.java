package day05;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 배열 10개 => 1~100까지의 랜덤수 저장
		// 출력

		// 오름차순 정렬 후 출력

		int arr[] = new int[10]; 
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 뒤에 작으면 오름차순 뒤에가 더 크면 오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int t : arr) {

			System.out.print(t + " ");
			
		}
		
	}

}
