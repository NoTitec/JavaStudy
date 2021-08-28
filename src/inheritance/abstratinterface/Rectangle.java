package inheritance.abstratinterface;

public class Rectangle extends Shape{
	double width;
	double height;
	public Rectangle(double x,double y,double width,double height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	public void draw() {
		super.drawCenter();
		System.out.println("가로"+width+"세로"+height);
		System.out.println("사각형 면적"+(width*height));
	}
}
