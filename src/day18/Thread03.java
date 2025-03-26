package day18;

public class Thread03 {

	public static void main(String[] args) {
		/* 1~50까지, 51~100까지의 합을 구하는 두개의 Thread를 생성
		 * 
		 * 두개의 Thread가 실행되고 난 뒤
		 * Thread-0 1~50까지의 출력 후 합계 출력
		 * Thread-1 51~100까지의 출력 후 합계 출력
		 * 
		 * main Thread-0 + Thread-1 합을 출력
		 */

		class SumThread extends Thread {
		    private int start;
		    private int end;
		    private int sum;

		    public SumThread(int start, int end) {
		        this.start = start;
		        this.end = end;
		        this.sum = 0;
		    }

		    public int getSum() {
		        return sum;
		    }

		    @Override
		    public void run() {
		        System.out.println(Thread.currentThread().getName() + " 출력:");
		        for (int i = start; i <= end; i++) {
		            System.out.print(i + " ");
		            sum += i;
		        }
		        System.out.println(Thread.currentThread().getName() + " 합계: " + sum);
		    }
		}
		  SumThread t1 = new SumThread(1, 50);
	        SumThread t2 = new SumThread(51, 100);

	        t1.start();
	        t2.start();
		
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        int total = t1.getSum() + t2.getSum();
	        System.out.println("Main Thread 총 합계: " + total);
	}
}

		