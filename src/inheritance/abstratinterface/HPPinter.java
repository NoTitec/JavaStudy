package inheritance.abstratinterface;

public class HPPinter extends Device implements Connectable{
	public void print() {//�ݵ�� �θ�Ŭ���� �������̵����ؾ��Ѵ�
	System.out.println("hp �������Դϴ�");	
	}
	public void connect() {
		System.out.println(name+"hp ������ ����");
	}
}
