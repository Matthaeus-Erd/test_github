package geoMetry;

import java.util.ArrayList;

public class Group {
	
	public ArrayList<Shapes> shapes;
	
	public Group() {
		this.shapes = new ArrayList<Shapes>();
	}

	public ArrayList<Shapes> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shapes> shapes) {
		this.shapes = shapes;
	}
	
	public void addShapes(Shapes s) {
		shapes.add(s);
	}
	
	public void removeShapes(Shapes s) {
		shapes.remove(s);
	}
	
	public double addedArea() {
		double addedArea = 0;
		for(Shapes s : shapes) {
			addedArea += s.calculateArea();
		}
		return addedArea;
	}
	
	public double addedCircumference() {
		double addedCircumference = 0;
		for(Shapes s : shapes) {
			addedCircumference += s.calculateCircumference();
		}
		return addedCircumference;
	}
	
	public String toString() {
		String tmp = "Alle Formen: ";
		for(Shapes s : shapes) {
			String shapeName = s.getShapeName();
			double shapeArea = s.calculateArea();
			double shapeCircumference = s.calculateCircumference();
			tmp = tmp + "\n\tName: " + shapeName +
					"\n\tFlaeche: " + shapeArea +
					"\n\tUmfang: " + shapeCircumference +
					"\n\t ";
		}
		return tmp;
	}
	
	public double biggestShape() {
		double maximumSize = 0;
		Shapes maxShape = shapes.get(0);
		for(Shapes s : shapes) {
			if(s.getArea() > maximumSize) {
				maximumSize = s.calculateArea();
				maxShape = s;
			}
		}
		System.out.println("Biggest shape: " + maxShape.getShapeName() +
		"(" + maxShape.calculateArea() + ")");
		return maximumSize;
	}
	
	public void printShapes() {
		System.out.println(this.toString());
	}
	
}