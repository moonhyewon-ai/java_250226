package day07;

public class Method06 {
	
	/* 1.랜덤(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	 * 매개변수 : 입력하는 게 없으니까 없음.
	 * 리턴타입 : 정수 배열 => int[]
	 * 
	 */
	public static int[] randomNum() {
		 int[] num = new int[5];
		 //int random=(int)(Math.random()*101);
	        
	     // 0~100 사이의 랜덤 숫자 5개를 배열에 저장
	        for (int i = 0; i < 5; i++) {
	            num[i] = (int)(Math.random()*101);
	}
	        return num;
	}
	/* 2.그 배열을 입력 받아서 평균을 리턴하는 메서드
	 * 매개변수 : 정수배열 => int[] arr
	 * 리턴타입 : 평균 => double
	 */
	public static double avg(int[] arr) {

        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
        	sum += arr[i];
        }
        return (double)sum/arr.length;
	}
	

	/* 3.배열을 출력, 평균을 출력하는 메서드
	 * 리턴타입 : 출력 =>void
	 * 매개변수 : 두가지 케이스 가능. (배열,평균을 받는 케이스) (안 받는 케이스)
	 */
	public static void arrayPrint() {   //매개변수 안 받는 케이스
		int arr[] = randomNum();
		for(int i=0; i<arr.length; i++) {
	    	 System.out.print(arr[i]+" ");
	     }
		System.out.println();
		double avg = avg(arr);
		System.out.println("평균:" + avg);
	}
	
public static void arrayPrint(int[] arr,double avg) {   //매개변수 받는 케이스(메서드의 이름은 같고 매개변수는 다르면 메서드 오버로딩)
	System.out.print("배열: ");
     for(int i=0; i<arr.length; i++) {
    	 System.out.print(arr[i]+" ");
     }
    System.out.print("평균: " + avg);

}
	
	public static void main(String[] args) {
		int arr[] =randomNum();
		arrayPrint(arr,avg(arr));
		/* 메서드에서의 배열 활용
		 * 1.랜덤(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드   내가 생각한 >> 리턴타입 : int   메서드 : randomNum  매개변수:num1,num2,num3,num4,num5
		 * 2.그 배열을 입력 받아서 평균을 리턴하는 메서드  >> 메서드 : avg 
		 * 3. 1번에서 만들 배열을 출력하고,
		 *    2번에서 만들 평균을 출력하는 메서드
		 *    main에서는 메서드 호출만 하기.
		 */
		
		
		
	}

}
