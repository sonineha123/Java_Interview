package ByRetuenType;

public class Test {
	
	public static void main(String[] args) {

	
		Shape[] s = new Shape[2];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);

//		  Circle c = (Circle) s[0];
//		  
//		  Rectangle r = (Rectangle) s[1];

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}

	}
}