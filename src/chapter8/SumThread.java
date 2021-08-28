package chapter8;

public class SumThread implements Runnable {
private int end;
	public SumThread(int end) {
		// TODO Auto-generated constructor stub
		this.end=end;
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// TODO Auto-generated method stub
		Runnable r1=new SumThread(5);
		Thread th1= new Thread(r1);
		th1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 1; i <= this.end; i++) {
			sum+=i;
			System.out.println(Thread.activeCount());
			System.out.println(Thread.currentThread().getName());
			System.out.println(i+sum);
		}
	}

}
