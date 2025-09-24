package tugas;

public class Triangle extends Rectangle{
	public Triangle() {}
	public Triangle(double radius1, double radius2, String color) {
		super(radius1, radius2, color);
	}
	public double getRadius1() {return radius1;}
	public double getRadius2() {return radius2;}
	public double getArea() {return radius1*radius2/2;}
	public double getPerimeter() {return radius1+radius2+Math.sqrt((radius1*radius1)+(radius2*radius2));}
}
