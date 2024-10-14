package WithConstructor;

public class Circle extends shape{
	
	public int r;

	public Circle() {
	}

	public Circle(int r) {
		this.r = r;
	}

	//public int getR() {
		//return r;
	//}
	
	@Override
	public double area() {
		double d = PI * r * r;
		return d;
	}


}
