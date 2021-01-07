package github6;

public class RectangleFromSimpleGeometricObject 
	extends SimpleGeometricObject{
	private double width;
	private double height;
	public RectangleFromSimpleGeometricObject(){
	}
	public RectangleFromSimpleGeometricObject(double width,double height){
		this.width=width;
		this.height=height;
	}
	public void RectangleFromSimpleGeometricObject1(double width, double height){
		this.width=width;
		this.height=height;
		setColor(getColor());
		setFilled(isFilled());
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width + height);
	}
	public String getRadius() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
