package WithoutConstructor;

public class TestShapeWithoutConstructor {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setR(2);
		
		Rectengle r = new Rectengle();
		
		r.setL(3);
		r.setW(4);
		
		//System.out.println(c.getR());
		//System.out.println(r.getL());
		//System.out.println(r.getW());
		System.out.println(c.area());
		System.out.println(r.area());
	}
}
