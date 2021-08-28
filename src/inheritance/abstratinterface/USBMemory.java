package inheritance.abstratinterface;

public class USBMemory extends Device implements Connectable{
	public void print() {
		System.out.println("삼성 메모리입니다");
	}
	public void connect() {
		System.out.println(name+"usb 연결");
	}
	
}
