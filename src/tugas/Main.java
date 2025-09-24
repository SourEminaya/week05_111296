package tugas;

import java.util.Scanner;

public class Main {
	public static void circlecalc(double radius1, String color) {
		Circle circle= new Circle(radius1, color);
		System.out.println("Lingkaran");
		System.out.println("Warna: "+circle.getColor());
		System.out.println("Radius: "+circle.getRadius());
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
	}
	public static void squarecalc(double radius1, String color) {
		Square circle= new Square(radius1, color);
		System.out.println("Persegi");
		System.out.println("Warna: "+circle.getColor());
		System.out.println("Radius: "+circle.getRadius());
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
	}
	public static void rectanglecalc(double radius1,double radius2, String color) {
		Rectangle circle= new Rectangle(radius1,radius2, color);
		System.out.println("Lingkaran");
		System.out.println("Warna: "+circle.getColor());
		System.out.println("Radius: "+circle.getRadius1()+"&"+circle.getRadius2());
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
	}
	public static void trianglecalc(double radius1,double radius2, String color) {
		Triangle circle= new Triangle(radius1,radius2, color);
		System.out.println("Lingkaran");
		System.out.println("Warna: "+circle.getColor());
		System.out.println("Radius: "+circle.getRadius1()+"&"+circle.getRadius2());
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
	}
	public static void main (String[] args) {
		Scanner in= new Scanner(System.in);
		int menu=0;
		while (menu!=5) {
			System.out.println("------Program Menghitung Bangun Ruang------");
			System.out.println("1. lingkaran\n2. Persegi\n3. Segitiga\n4. Persegi Panjang\n5. Keluar");
			menu= in.nextInt();
			double radius1;
			double radius2;
			String color;
			switch(menu) {
			case 1:
				System.out.println("Masukkan Radius: ");
				radius1=in.nextDouble();
				System.out.println("Masukkan Warna: ");
				color=in.nextLine();
				circlecalc(radius1, color);
				break;
			case 2:
				System.out.println("Masukkan Radius: ");
				radius1=in.nextDouble();
				System.out.println("Masukkan Warna: ");
				color=in.nextLine();
				squarecalc(radius1, color);
				break;
			case 3:
				System.out.println("Masukkan Radius1: ");
				radius1=in.nextDouble();
				System.out.println("Masukkan Radius2: ");
				radius2=in.nextDouble();
				System.out.println("Masukkan Warna: ");
				color=in.nextLine();
				trianglecalc(radius1, radius2, color);
				break;
			case 4:
				System.out.println("Masukkan Radius1: ");
				radius1=in.nextDouble();
				System.out.println("Masukkan Radius2: ");
				radius2=in.nextDouble();
				System.out.println("Masukkan Warna: ");
				color=in.nextLine();
				rectanglecalc(radius1, radius2, color);
				break;
			case 5:
				
				break;
			default: System.out.println("Masukkan ulang input");
			break;
			
			}
			
		}in.close();
		
		
	}
}
