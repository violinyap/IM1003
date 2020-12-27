public class MyLine{
	private MyPoint begin, end;

	public MyLine(int x1,int y1, int x2, int y2){
		this.begin = new MyPoint();
		begin.setXY(x1,y1);
		this.end = new MyPoint();
		end.setXY(x2,y2);
	}

	public MyLine(MyPoint begin, MyPoint end){
		this.begin = new MyPoint();
		this.begin=begin;
		this.end = new MyPoint();
		this.end=end;
	}

	public MyPoint getBegin(){return begin;}
	public void setBegin(MyPoint begin){this.begin=begin;}
	public MyPoint getEnd(){return end;}
	public void setEnd(MyPoint end){this.end=end;}

	public int getBeginX(){return begin.getX();}
	public void setBeginX(int x){begin.setX(x);}
	public int getBeginY(){return begin.getY();}
	public void setBeginY(int y){begin.setY(y);}

	public int getEndX(){return end.getX();}
	public void setEndX(int x){end.setX(x);}
	public int getEndY(){return end.getY();}
	public void setEndY(int y){end.setY(y);}

	public int[] getBeginXY(){return begin.getXY();}
	public void setBeginXY(int x,int y){begin.setXY(x,y);}
	public int[] getEndXY(){return end.getXY();}
	public void setEndXY(int x,int y){end.setXY(x,y);}

	public double getLength(){
		return begin.distance(end);
	}

	public double getGradient(){
		int yDiff = end.getY()-begin.getY();
		int xDiff = end.getX()-begin.getX();
		return Math.atan2(yDiff,xDiff);
	}

	public String toString(){
		return "MyLine[begin="+ begin+",end="+end+"]";
	}
}