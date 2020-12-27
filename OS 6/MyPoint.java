public class MyPoint{
	private int x=0,y=0;

	public MyPoint(){
		x=0;
		y=0;
	}

	public MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}

	public MyPoint(MyPoint point){
		this.x=point.getX();
		this.y=point.getY();
	}

	public int getX(){return x;}
	public int getY(){return y;}
	public void setX(int x){this.x=x;}
	public void setY(int y){this.y=y;}
	public int[] getXY(){
		int[] point= new int[2];
		point[0]=x;
		point[1]=y;
		return point;
	}

	public void setXY(int x, int y){
		this.x=x;
		this.y=y;
	}

	public String toString(){
		return "("+x+","+y+")";
	}

	public double distance(int x,int y){
		return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
	}

	public double distance(MyPoint another){
		return distance(another.getX(),another.getY());
	}

	public double distance(){
		return distance(0,0);
	}
}