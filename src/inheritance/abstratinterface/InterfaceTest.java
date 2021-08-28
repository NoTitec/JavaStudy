package inheritance.abstratinterface;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device pdev[]= {new HPPinter(),new USBMemory()};
		pdev[0].print();
		pdev[1].print();
		((Connectable)pdev[0]).connect();//implements추상메도드는 동적바인딩이 안된다 이것을 기억해야한다 이렇게 안하면 컴파일 오류 발생
		((Connectable)pdev[1]).connect();
	}

}
