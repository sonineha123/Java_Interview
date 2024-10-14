package WithoutConstructor;

public class Circle extends Shape{
	public int r;

	//public Circle() {
	//}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double area() {
		double d = PI * r * r;
		return d;
	}





}
