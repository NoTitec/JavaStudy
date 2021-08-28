package inheritance.abstratinterface;

public class HPPinter extends Device implements Connectable{
	public void print() {//반드시 부모클래스 오버라이딩을해야한다
	System.out.println("hp 프린터입니다");	
	}
	public void connect() {
		System.out.println(name+"hp 프린터 연결");
	}
}
