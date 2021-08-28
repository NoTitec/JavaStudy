package chapter8;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncThread inc= new IncThread("증가 스레드");
		inc.start();
		DecThread dec = new DecThread("감소 스레드");
		dec.start();
	}

}
