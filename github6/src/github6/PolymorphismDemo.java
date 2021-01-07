package github6;

public class PolymorphismDemo {
public static void main(String[] args) {
			displayObject(new SimpleGeometricObject("red", false));
			displayObject(new RectangleFromSimpleGeometricObject(1,1));
		}
		public static void displayObject(SimpleGeometricObject object){
			System.out.println("Created on" + object.getDateCreated() +
					". Color is " + object.getColor());
		}

	}
