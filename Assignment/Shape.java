package com.cognizant.shapes;
/*
 * @Author Farzana Shaikh
 */


class Circle {

	float radius;

	Circle() {

		radius = 1.5f;
	}

	void show() {
		System.out.println("Radius of the circle: " + radius);
	}

}

public class Shape {

	public static void main(String[] args) {

		Circle r = new Circle();
		r.show();

	}

}