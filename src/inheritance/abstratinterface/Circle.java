package inheritance.abstratinterface;

public class Circle extends Shape{
	double radius;
	
	public Circle(double x, double y,double radius) {
		super(x,y);
		this.radius=radius;
	}
	public void draw() {
		super.drawCenter();
		System.out.println("������"+radius);
		System.out.println("�� ����"+(radius*radius*Math.PI));
	}
}
