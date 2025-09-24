package tugas;

public class Square extends Shape{
	private double radius;
	public Square() {}
	public Square(double radius, String color) {
		super(color);
		this.radius=radius;
	}
	public double getRadius() {return radius;}
	public double getArea() {return radius*radius;}
	public double getPerimeter() {return 4*radius;}
	
}