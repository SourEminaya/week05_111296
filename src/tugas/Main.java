package tugas;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Masukkan Jari-jari lingkaran: ");
		double radius= in.nextDouble();
		System.out.println("Masukkan warna: ");
		String warna=in.nextLine();
		System.out.println("------Lingkaran------");
		Circle circle= new Circle(radius,warna);
		System.out.println("Warna: "+circle.getColor());
		System.out.println("Radius: "+circle.getRadius());
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
		
		
	}
}
