package chapter8;

public class MyExceptionTest {
	public static void main(String[] args) {
		try {
			doException(true);
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void doException(boolean bool) throws MyException{
		if(bool) {
			throw new MyException("my create except");
		}
	}
}
