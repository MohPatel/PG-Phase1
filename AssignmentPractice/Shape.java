package AssignmentPractice;

 abstract class Shape {

	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
	class Circle extends Shape{

		double radius;
		public Circle(String color, double radius) {
			super(color);
			// TODO Auto-generated constructor stub
			System.out.println("Circle constructore called");
			this.radius = radius;
		}
		@Override
		double area() {
			// TODO Auto-generated method stub
			return Math.PI * Math.pow(radius, 2);
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Circle color is " + super.color + " and area is: " + area();
		}
	}
	
	class Rectangle extends Shape {

		double length;
		double width;
		public Rectangle(String color, double length, double width) {
			super(color);
			// TODO Auto-generated constructor stub
			System.out.println("Rectangle constructore called");
			this.length = length;
			this.width = width;
		}

		@Override
		double area() {
			// TODO Auto-generated method stub
			return this.length * this.width;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Rectangle color is " + super.color + "and area is: "+ area();
		}
	}
	
	
	
	

