package inheritance.abstratinterface;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device pdev[]= {new HPPinter(),new USBMemory()};
		pdev[0].print();
		pdev[1].print();
		((Connectable)pdev[0]).connect();//implements�߻�޵���� �������ε��� �ȵȴ� �̰��� ����ؾ��Ѵ� �̷��� ���ϸ� ������ ���� �߻�
		((Connectable)pdev[1]).connect();
	}

}
