package github4;

public class example2 {
    public static void main(String[] arg) {
    	SimpleCircle circle1 = new SimpleCircle();
    	System.out.println("The are arae the circle of radius "+circle1.radius + " is "+circle1.getArea());
    	SimpleCircle circle2 = new SimpleCircle(25);
    	System.out.println("The are arae the circle of radius "+circle2.radius + " is "+circle2.getArea());
    	SimpleCircle circle3 = new SimpleCircle(125);
    	System.out.println("The are arae the circle of radius "+circle3.radius + " is "+circle3.getArea());
    	circle2.radius = 100;
    	System.out.println("The are arae the circle of radius "+circle2.radius + " is "+circle2.getArea());
    }
    double radius;
    void SimpleCircle() {
    	radius = 1;
    }
    void SimpleCircle(double newRadius) {
    	radius = newRadius;
    }
    double getArea() {
    	return  radius*radius*radius;
    }
    double getPerimeter() {
    	return 2*radius*Math.PI;
    }
    void setRadius(double newRadius) {
    	radius = newRadius;
    }
}
