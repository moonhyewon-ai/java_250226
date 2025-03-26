package day18;

public class Thread02 {

	public static void main(String[] args) {
		// 2.runnable 구현하는 방법
		System.out.println(Thread.currentThread().getName());
		System.out.println("main thread start!!");

		MyThread2 th2 = new MyThread2();
		//interface로 구현한 스레드 객체는 thread 객체가 없어서
		//실행이 안 됨
		//thread 객체를 구현해서 넣어줘야 함.
		Thread t = new Thred(th2);
		t.start();
		
		MyThread2 = th3 = new MyThread2();
		Thread t1 = new Thread(th3);
		t1.start();
		
		System.out.println("main thread end!!");
	}

}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		// run은 반드시 구현해야 함
		for(int i=0; i<=500; i++) {
			System.out.println(i + ". thread >" + Tread.currentT);
		}
		
	}
	
	
}