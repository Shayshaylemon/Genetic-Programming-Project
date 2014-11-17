
public class DataRow {
	private double y;
	private double[] Xarray = new double[20];
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double[] getXarray() {
		return Xarray;
	}

	public void addX(double newX, int pos) {
		Xarray[pos] = newX;
	}
	
	
}
