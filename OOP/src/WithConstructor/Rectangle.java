package WithConstructor;

public class Rectangle extends shape{
	
	public int l;
	public int w;

	public Rectangle() {
	}

	public Rectangle(int l, int w) {
		this.l = l;
		this.w = w;

	}

	//public int getL() {
		//return l;
	//}
	
	//public int getW() {
		//return w;
	//}
	
	@Override
	public double area() {
		double d = l * w;
		return d;
	}


}
