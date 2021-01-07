package github6;

public class TestCircleRectangle {

		public static void main(String[] args) {
			RectangleFromSimpleGeometricObject circle = new RectangleFromSimpleGeometricObject();
			System.out.println("A circle " + circle.toString());
			System.out.println("The color is " + circle.getColor());
			System.out.println("The radius is " + circle.getRadius());
			System.out.println("The area is " + circle.getArea());
			System.out.println("The diameter is " + circle.getPerimeter());
			
			
			RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
			System.out.println("\nA rectangle " + rectangle.toString());
			System.out.println("The area is " + rectangle.getArea());
			System.out.println("The perimeter is " + rectangle.getPerimeter());
		}

	}

