package solid.OCP;

import java.util.List;

public class AreaCalculator {

	public double area(List<Shape> shapes) {
		double area = 0;
		
		for (Shape shape : shapes) {
			area += shape.area();
		}
		
		return area;
	}

}
