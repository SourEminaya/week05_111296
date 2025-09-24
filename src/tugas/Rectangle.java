package tugas;

public class Rectangle extends Shape {
	protected double radius1;
	protected double radius2;
	public Rectangle() {}
	public Rectangle(double radius1, double radius2, String color) {
		super(color);
		this.radius1=radius1;
		this.radius2=radius2;
	}
	public double getRadius1() {return radius1;}
	public double getRadius2() {return radius2;}
	public double getArea() {return radius1*radius2;}
	public double getPerimeter() {return 2*(radius1+radius2);}
	
}