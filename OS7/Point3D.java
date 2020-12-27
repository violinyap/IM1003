public class Point3D extends Point2D {
	private float z;

	public Point3D(){
		super();
		this.z=0.0f;
	}

	public Point3D(float x,float y, float z){
		super(x,y);
		this.z=z;
	}

	public float getZ(){return z;}
	public void setZ(float z){this.z=z;}
	public void setXYZ(float x,float y, float z){
		super.setXY(x,y);
		this.z=z;
	}
	public float[] getXYZ(){
		float[] point;
		point = new float[3];
		point[0]=getX();
		point[1]=getY();
		point[2]=z;
		return point;
	}

	@Override
	public String toString(){
		return "("+getX()+","+getY()+","+z+")";
	}
}