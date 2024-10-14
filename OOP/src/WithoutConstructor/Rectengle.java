package WithoutConstructor;

public class Rectengle extends Shape{
	
	public int l;
	public int w;

	//public Rectengle() {
	//}
	
	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	@Override
	public double area() {
		double d = l * w;
		return d;
	}

}



