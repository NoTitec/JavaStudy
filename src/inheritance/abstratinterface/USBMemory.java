package inheritance.abstratinterface;

public class USBMemory extends Device implements Connectable{
	public void print() {
		System.out.println("�Ｚ �޸��Դϴ�");
	}
	public void connect() {
		System.out.println(name+"usb ����");
	}
	
}
