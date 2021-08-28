package inheritance.abstratinterface;

public class Circle extends Shape{
	double radius;
	
	public Circle(double x, double y,double radius) {
		super(x,y);
		this.radius=radius;
	}
	public void draw() {
		super.drawCenter();
		System.out.println("반지름"+radius);
		System.out.println("원 면적"+(radius*radius*Math.PI));
	}
}
