interface Shape {
	double area();
	double perimeter();
}

class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	
	public double area() {

		return length * breadth;
	}

	
	public double perimeter() {

		return 2 * (length + breadth);
	}
}

class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	
	public double area() {

		return Math.PI * radius * radius;
	}

	
	public double perimeter() {

		return 2 * Math.PI * radius;
	}
}
class square implements Shape{
    
    private double area() {
        return lenght*lenght;
    }

    private double perimeter(){
        return 4*lenght;
    }
}
class triangle implements Shape{

    private double area(){
        return 0.5*base*height;
    }

    private double perimeter(){
        return sideA+sideB+sideC;
    }
}
public class Sample {

	public static void main(String[] args) {
		// Rectangle area and parameter
		double length = 2.0;
		double breadth = 3.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.perimeter());

		// Circle area and parameter
		double radius = 2.0;
		Circle c = new Circle(radius);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());

		// square area and perimeter
		double lenght = 2.0;
		square s= new sqaure(lenght);

		System.out.println("Square - Area: " + s.area());
		System.out.println("square - perimeter: " + s.perimeter());

	}
}