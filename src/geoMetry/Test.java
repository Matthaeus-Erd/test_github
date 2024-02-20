package geoMetry;

public class Test {

	public static void main(String[] args) {
		
		Coordinate c1 = new Coordinate(4, 1);
		Coordinate c2 = new Coordinate(3, 5);
		Coordinate c3 = new Coordinate(7, 2);
		
		Group g = new Group();
		
		//Test Circle
		System.out.println("Circle Test: ");
		Circle c = new Circle(c1, c2);
		double radius = c.calculateRadius(c1, c2);
		System.out.println("Der Radius des Kreises ist: " + radius);
		System.out.println("Die Fläche des Kreises ist: " + c.calculateArea());
		System.out.println("Der Umfang des Kreises ist: " + c.calculateCircumference());
		g.addShapes(c);
		
		System.out.println(" ");
		
		//Test Rectangle
		System.out.println("Rectangle Test: ");
		Rectangle r = new Rectangle(c1, c2);
		System.out.println("Die Fläche des Rechtecks ist: " + r.calculateArea());
		System.out.println("Der Umfang des Rechtecks ist: " + r.calculateCircumference());
		g.addShapes(r);
		
		System.out.println(" ");
		
		//Triangle test
		System.out.println("Triangle Test: ");
		Triangle t = new Triangle(c1, c2, c3);
		

	}

}
