public class Square extends Rectangle {
	protected double side,length;
	
	public Square(){
		side=1.0; length=1.0;
	}

	public Square(double side){
		super(side,side);
		this.side=side;

	}

	public Square(double side, String color, boolean filled){
		super(side,side,color,filled);
		this.side=side;
	}

	public double getSide(){return side;}
	public void setSide(double side){this.side=side; 
		super.setWidth(side); 
		super.setLength(side);
	}

	@Override
	public void setWidth(double width){setSide(width);}

	@Override
	public void setLength(double length){setSide(length);}

	@Override
	public double getArea(){
		return side*side;
	}

	@Override
	public double getPerimeter(){
		return (side)*4.0;
	}

	public String toString(){
		return "Square["+super.toString()+"]";
	}
}