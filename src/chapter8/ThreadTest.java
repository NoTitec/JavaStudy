package chapter8;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncThread inc= new IncThread("���� ������");
		inc.start();
		DecThread dec = new DecThread("���� ������");
		dec.start();
	}

}
