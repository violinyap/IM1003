public class Circle implements GeometricObject {
	protected double radius;

	public Circle(double radius){
		this.radius=radius;
	}

	public String toString(){
		return "Circle[radius="+String.format("%.1f",radius)+"]";
	}

	@Override public double getArea(){
		return Math.PI*radius*radius;
	}

	@Override public double getPerimeter(){
		return Math.PI*radius*2.0;
	}


} 