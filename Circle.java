
public class Circle {
	
	private double radius;
	private double area;

	public Circle(double radius){
		this.radius = radius;
		this.area = Math.PI*Math.pow(radius, 2);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
		area = Math.PI*Math.pow(radius, 2);
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double a) {
		this.area = a;
		radius = Math.sqrt (a/Math.PI);
	}
	
}
