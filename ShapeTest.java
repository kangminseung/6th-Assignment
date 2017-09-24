class Shape {
	protected int x, y;
  	Shape(int x, int y) {
  		this.x =x;
  		this.y =y;
	}
	public void draw() {
		System.out.println("Shape Draw < x = "+ x+ ", y = "+y+" >");
	}
}
  
class Rectangle extends Shape {
	private int width, height;
	Rectangle(int x,int y,int width, int height)
	{
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("Rectangle Draw < x = "+ x+ ", y = "+y+", width = "+width+", height = "+height+" >");
	}
}
class Triangle extends Shape {
	private int base, height;
	Triangle(int x,int y, int base,int height)
	{
		super(x,y);
  		this.base = base;
  		this.height = height;
	}
  	public void draw() {
		System.out.println("Triangle Draw < x = "+ x+ ", y = "+y+", base = "+base+", height = "+height+" >");
	}
}
  
class Circle extends Shape {
	private int radius;
	Circle(int x,int y,int radius)
	{
		super(x,y);
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle Draw < x = "+ x+ ", y = "+y+", radius = "+radius+" >");
	}
}

public class ShapeTest {
	public static void main(String arg[]) {
		Shape s1, s2, s3, s4;
  
		s1 = new Shape(1,2);
		s2 = new Rectangle(2,3,4,5);
		s3 = new Triangle(3,4,5,6);
		s4 = new Circle(4,5,6);
  
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}
}

