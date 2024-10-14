package com.oop.setterGetter;

public class TestShape {
	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		Rectangle r = (Rectangle) s[1];

		c.setR(1);
		r.setL(5);
		r.setW(5);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());

		}
	}
}