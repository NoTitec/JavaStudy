package chapter6;

public class Motor extends Vehicle {
	public String name="car2";
	public int displacement;
	
	public Motor() {
		super();
	}
	public Motor(double maxspeed, int seater, int displacement) {
		super(maxspeed,seater);
		this.displacement=displacement;
	}
	public void printinfo() {
		System.out.println(super.name+this.name);
		System.out.println("�ִ�ӵ�:"+maxSpeed+"km");
		System.out.println("����:"+seater+"��");
		System.out.println("��ⷮ"+displacement+"cc");
	}
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxSpeed=maxspeed;
	}
	public void setSeater(int seater) {
		this.seater=seater;
	}
	public static void main(String[] args) {
		Motor mycar= new Motor(300,4,5000);
		
		mycar.printinfo();
	}
}
