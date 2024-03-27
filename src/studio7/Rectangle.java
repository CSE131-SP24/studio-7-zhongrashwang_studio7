package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	public double getArea() {
		double area = length*width;
		return area;
	}
	public double getPerimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}
	public void compareArea(Rectangle x) {
		if(x.getArea() > this.getArea()) {
			System.out.println("the area of the given rectangle is larger");
		}
		else {
			System.out.println("the area of the current rectangle is larger");
		}
	}
	public void isSquare(){
		if(length == width) {
			System.out.println("this is a square");
		}
		else {
			System.out.println("this is not a square");
		}
	}
	
	
	
	public static void main(String[] args){
		Rectangle a = new Rectangle(3.0, 4.0);
		Rectangle b = new Rectangle(4.0, 4.0);
		System.out.println("area of rectangle: " + a.getArea());		
		System.out.println("perimeter of rectangle: " + a.getPerimeter());	
		a.compareArea(b);
		b.isSquare();
		a.isSquare();
	}
	
}

