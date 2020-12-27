public class MovablePoint extends Point{
	private float xSpeed, ySpeed;

	public MovablePoint(){
		super();
		xSpeed=0.0f;
		ySpeed=0.0f;
	}

	public MovablePoint(float x, float y, float xSpeed, float ySpeed){
		super(x,y);
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}

	public MovablePoint(float xSpeed,float ySpeed){
		super();
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}

	public float getXSpeed(){return xSpeed;}
	public void setXSpeed(float xSpeed){this.xSpeed=xSpeed;}
	public float getYSpeed(){return ySpeed;}
	public void setYSpeed(float ySpeed){this.ySpeed=ySpeed;}
	public void setSpeed(float xSpeed, float ySpeed){
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	public float[] getSpeed(){
		float[] speed = new float[2];
		speed[0]=xSpeed;
		speed[1]=ySpeed;
		return speed;
	}

	@Override
	public String toString(){
		return super.toString()+",speed=("+xSpeed+","+ySpeed+")";
	}

	public MovablePoint move(){
		setX(getX()+xSpeed);
		setY(getY()+ySpeed);
		return this;
	}
}
