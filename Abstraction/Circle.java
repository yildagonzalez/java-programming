package Abstraction;

class Circle extends Shape {
	
	double radius;
	
	public Circle(String color, double radius) {
		
		super(color); // calling shape constructor
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {

		return "Circle color is " + super.color  + " and area is: " + area();
	}
	
	
}
